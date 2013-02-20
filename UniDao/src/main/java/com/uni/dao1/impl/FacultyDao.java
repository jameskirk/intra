package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.base.Faculty;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IFacultyDao;

@Repository
public class FacultyDao extends UniJpaRepository<Faculty, Integer> implements IFacultyDao {
	
	@Autowired
	public FacultyDao(EntityManager em) {
		super(Faculty.class, em);
	}
}
