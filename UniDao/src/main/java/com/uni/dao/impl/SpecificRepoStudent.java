package com.uni.dao.impl;

import javax.persistence.EntityManager;

import com.uni.dao.util.UniJpaRepository;
import com.uni.jpa.base.UniGroup;

public class SpecificRepoStudent<T> extends UniJpaRepository<T, Integer>{

	public SpecificRepoStudent(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
		// TODO Auto-generated constructor stub
	}


}
