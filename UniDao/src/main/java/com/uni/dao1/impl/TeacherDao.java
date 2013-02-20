package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.base.Teacher;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.ITeacherDao;

@Repository
public class TeacherDao extends UniJpaRepository<Teacher, Integer> implements ITeacherDao {
	
	@Autowired
	public TeacherDao(EntityManager em) {
		super(Teacher.class, em);
	}
}
