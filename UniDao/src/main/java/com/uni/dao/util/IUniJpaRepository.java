package com.uni.dao.util;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUniJpaRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
	
	public T findOneBy(String fieldName, String fieldValue);

}
