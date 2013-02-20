package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.studies.DeadlineInfo;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IDeadlineInfoDao;

@Repository
public class DeadlineInfoDao extends UniJpaRepository<DeadlineInfo, Integer> implements IDeadlineInfoDao {
	
	@Autowired
	public DeadlineInfoDao(EntityManager em) {
		super(DeadlineInfo.class, em);
	}
}
