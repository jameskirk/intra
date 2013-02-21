package com.uni.dao;

import java.util.List;

import com.uni.dao.etc.DaoException;
import com.uni.dao.repo.UniQuery;

public interface UniDao {
	
	public <T> void addSomething(Object source, Class<T> type) throws DaoException;
	
	public <T> T getSomething(int id, Class<T> type) throws DaoException;
	
	public <T> void deleteSomething(int id, Class<T> type) throws DaoException;
	
	public <T> void updateSomething(T source, Class<T> type) throws DaoException;
	
	public <T> List<T> searchSomething(Class<T> type, UniQuery uniQuery) throws DaoException;
	
}
