package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.base.Student;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IStudentDao;

@Repository
public class StudentDao extends UniJpaRepository<Student, Integer> implements IStudentDao {
	
	@Autowired
	public StudentDao(EntityManager em) {
		super(Student.class, em);
	}
}
