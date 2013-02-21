package com.uni.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uni.dao.UniDao;
import com.uni.dao.etc.DaoException;
import com.uni.dao.etc.UniJpaRepository;
import com.uni.dao.repo.SpecificRepoStudent;
import com.uni.dao.repo.UniQuery;
import com.uni.jpa.base.Student;
import com.uni.jpa.base.UniGroup;

@Repository
@SuppressWarnings("unchecked")
public class UniDaoImpl implements UniDao {
	
	private Map<Class<?>, UniJpaRepository<?, Integer>> map;
	
	private EntityManager em;
	
	@Autowired
	public UniDaoImpl(EntityManager em) {
		this.em = em;
		map = new HashMap<Class<?>, UniJpaRepository<?,Integer>>();
		map.put(UniGroup.class, new UniJpaRepository<UniGroup, Integer>(UniGroup.class, em));
		map.put(UniGroup.class, new UniJpaRepository<UniGroup, Integer>(UniGroup.class, em));
		map.put(Student.class, new SpecificRepoStudent<Student>(Student.class, em));
	}

	@Override
	public <T> void addSomething(Object source, Class<T> type) throws DaoException {
		try {
			if (map.containsKey(type)) {
				((UniJpaRepository<T, Integer>) map.get(type)).saveAndFlush((T)source);
			} else {
				throw new DaoException();
			}
		} catch (RuntimeException e) {
			throw new DaoException();
		}
	}
	
	@Override
	public <T> void deleteSomething(int id, Class<T> type) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void updateSomething(T source, Class<T> type) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T getSomething(int id, Class<T> type) throws DaoException {
		try {
			if (map.containsKey(type)) {
				T source = ((UniJpaRepository<T, Integer>) map.get(type)).findOne(id);
				return source;
			} else {
				throw new DaoException();
			}
		} catch (RuntimeException e) {
			throw new DaoException();
		}
	}

	@Override
	public <T> List<T> searchSomething(Class<T> type, UniQuery uniQuery)
			throws DaoException {
		try {
			if (map.containsKey(type)) {
				Query query = em.createNamedQuery(uniQuery.toString());
				return (List<T>) query.getResultList();
			} else {
				throw new DaoException();
			}
		} catch (RuntimeException e) {
			throw new DaoException();
		}
	}

}
