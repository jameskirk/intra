package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.studies.Subject;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.ISubjectDao;

@Repository
public class SubjectDao extends UniJpaRepository<Subject, Integer> implements ISubjectDao {
	
	@Autowired
	public SubjectDao(EntityManager em) {
		super(Subject.class, em);
	}
}
