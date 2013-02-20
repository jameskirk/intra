package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.base.UniGroup;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IUniGroupDao;

@Repository
public class UniGroupDao extends UniJpaRepository<UniGroup, Integer> implements IUniGroupDao {
	
	@Autowired
	public UniGroupDao(EntityManager em) {
		super(UniGroup.class, em);
	}
}
