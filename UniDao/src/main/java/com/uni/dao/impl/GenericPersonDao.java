package com.uni.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uni.dao.etc.UniJpaRepository;
import com.uni.dao.repo.SpecificRepoStudent;
import com.uni.jpa.base.Student;
import com.uni.jpa.base.UniGroup;

public class GenericPersonDao {
	
	private EntityManager em;
	
	public GenericPersonDao(EntityManager em) {
		this.em = em;
		map = new HashMap<Class<?>, UniJpaRepository<?,Integer>>();
		init();
	}
	
//	UniJpaRepository<UniGroup, Integer> uniRepo = new UniJpaRepository<UniGroup, Integer>(UniGroup.class, em);
	
	private Map<Class<?>, UniJpaRepository<?, Integer>> map;
	
	public void init() {
		map.put(UniGroup.class, new UniJpaRepository<UniGroup, Integer>(UniGroup.class, em));
		map.put(Student.class, new SpecificRepoStudent<Student>(Student.class, em));
	}
	
	
	public <T> void addSomething(T source, Class<T> type) {
		//if (found in map - generic repo) 100500 repo
		if (map.containsKey(type)) {
			((UniJpaRepository<T, Integer>) map.get(type)).saveAndFlush(source);
		}
	}
	
	public <T> T getSomething(int id, Class<T> type) {
		if (map.containsKey(type)) {
			T source = ((UniJpaRepository<T, Integer>) map.get(type)).findOne(id);
			System.out.println("getSmt");
			return source;
		}
		System.out.println("getSmt null");
		return null;
	}

	
	
//	public <T> UniJpaRepository<T, Integer> resolve(Class<T> type) {
//		if (UniGroup.class.equals(type)) {
//			return   (UniJpaRepository<T, Integer>) new SpecificRepoUni<UniGroup>(null, null);
//		} else if (Student.class.equals(type)) {
//			return   (UniJpaRepository<T, Integer>) new SpecificRepoStudent<Student>(null, null);
//		}
//		return null;
//	}
	
}
