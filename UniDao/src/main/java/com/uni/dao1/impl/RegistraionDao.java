package com.uni.dao1.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uni.jpa.security.Registraion;
import com.uni.dao.util.UniJpaRepository;
import com.uni.dao1.IRegistraionDao;

@Repository
public class RegistraionDao extends UniJpaRepository<Registraion, Integer> implements IRegistraionDao {
	
	@Autowired
	public RegistraionDao(EntityManager em) {
		super(Registraion.class, em);
	}
}
