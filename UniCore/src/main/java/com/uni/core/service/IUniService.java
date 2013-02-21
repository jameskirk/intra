package com.uni.core.service;

import com.uni.core.exception.UniException;


public interface IUniService {
	
	public <T> void addSomething(T source, Class<T> type) throws UniException;
	
	public <T> T getSomething(int id, Class<T> type) throws UniException;
	
}
