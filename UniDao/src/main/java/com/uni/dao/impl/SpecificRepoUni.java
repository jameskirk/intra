package com.uni.dao.impl;

import javax.persistence.EntityManager;

import com.uni.dao.etc.UniJpaRepository;
import com.uni.jpa.base.UniGroup;

public class SpecificRepoUni<T> extends UniJpaRepository<T, Integer>{

	public SpecificRepoUni(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
		// TODO Auto-generated constructor stub
	}


}
