package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.base.Department;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IDepartmentDao;

@Repository
public class DepartmentDao extends UniJpaRepository<Department, Integer> implements IDepartmentDao {
	
	@Autowired
	public DepartmentDao(EntityManager em) {
		super(Department.class, em);
	}
}
