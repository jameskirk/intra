package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.studies.Timetable;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.ITimetableDao;

@Repository
public class TimetableDao extends UniJpaRepository<Timetable, Integer> implements ITimetableDao {
	
	@Autowired
	public TimetableDao(EntityManager em) {
		super(Timetable.class, em);
	}
}
