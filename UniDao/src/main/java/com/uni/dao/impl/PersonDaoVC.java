package com.uni.dao.impl;

import java.util.Map;

import com.uni.dao.util.UniJpaRepository;
import com.uni.jpa.base.Student;
import com.uni.jpa.base.UniGroup;

public class PersonDaoVC {
	
	UniJpaRepository<UniGroup, Integer> uniRepo = new UniJpaRepository<UniGroup, Integer>(UniGroup.class, null);
	
	private Map<Class<?>, UniJpaRepository<?, Integer>> map;
	
	public void init() {
		map.put(UniGroup.class, new UniJpaRepository<UniGroup, Integer>(UniGroup.class, null));
	}
	
	public <T> void addSomething(T source, Class<T> type) {
		//if (found in map - generic repo) 100500 repo
		((UniJpaRepository<Class<T>, Integer>) map.get(type)).saveAndFlush((Class<T>)source);
		
		// if not found in map - specific repo, few repo
		resolve(type).saveAndFlush(source);
		
//		if (UniGroup.class.equals(type)) {
//			uniRepo.saveAndFlush((UniGroup) source);
//		}
		
		
	}
	
	public <T> UniJpaRepository<T, Integer> resolve(Class<T> type) {
		if (UniGroup.class.equals(type)) {
			return   (UniJpaRepository<T, Integer>) new SpecificRepoUni<UniGroup>(null, null);
		} else if (Student.class.equals(type)) {
			return   (UniJpaRepository<T, Integer>) new SpecificRepoUni<UniGroup>(null, null);
		}
		return null;
	}
	
}
