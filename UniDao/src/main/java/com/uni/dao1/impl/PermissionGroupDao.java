package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.security.PermissionGroup;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IPermissionGroupDao;

@Repository
public class PermissionGroupDao extends UniJpaRepository<PermissionGroup, Integer> implements IPermissionGroupDao {
	
	@Autowired
	public PermissionGroupDao(EntityManager em) {
		super(PermissionGroup.class, em);
	}
}
