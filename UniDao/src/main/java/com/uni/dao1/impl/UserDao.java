package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.base.User;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IUserDao;

@Repository
public class UserDao extends UniJpaRepository<User, Integer> implements IUserDao {
	
	@Autowired
	public UserDao(EntityManager em) {
		super(User.class, em);
	}
}
