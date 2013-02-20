package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.studies.CourcePlan;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.ICourcePlanDao;

@Repository
public class CourcePlanDao extends UniJpaRepository<CourcePlan, Integer> implements ICourcePlanDao {
	
	@Autowired
	public CourcePlanDao(EntityManager em) {
		super(CourcePlan.class, em);
	}
}
