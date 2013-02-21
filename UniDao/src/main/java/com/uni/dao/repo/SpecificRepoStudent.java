package com.uni.dao.repo;

import javax.persistence.EntityManager;

import com.uni.dao.etc.UniJpaRepository;

public class SpecificRepoStudent<T> extends UniJpaRepository<T, Integer>{

	public SpecificRepoStudent(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
	}


}
