package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.security.UserAccount;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IUserAccountDao;

@Repository
public class UserAccountDao extends UniJpaRepository<UserAccount, Integer> implements IUserAccountDao {
	
	@Autowired
	public UserAccountDao(EntityManager em) {
		super(UserAccount.class, em);
	}
}
