package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.studies.Deadline;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IDeadlineDao;

@Repository
public class DeadlineDao extends UniJpaRepository<Deadline, Integer> implements IDeadlineDao {
	
	@Autowired
	public DeadlineDao(EntityManager em) {
		super(Deadline.class, em);
	}
}
