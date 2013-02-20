package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.security.Permission;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IPermissionDao;

@Repository
public class PermissionDao extends UniJpaRepository<Permission, Integer> implements IPermissionDao {
	
	@Autowired
	public PermissionDao(EntityManager em) {
		super(Permission.class, em);
	}
}
