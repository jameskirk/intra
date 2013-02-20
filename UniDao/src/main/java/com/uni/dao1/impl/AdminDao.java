package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.base.Admin;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IAdminDao;

@Repository
public class AdminDao extends UniJpaRepository<Admin, Integer> implements IAdminDao {
	
	@Autowired
	public AdminDao(EntityManager em) {
		super(Admin.class, em);
	}
}
