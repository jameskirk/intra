package com.uni.dao.etc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.serviceloader.ServiceLoaderFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoServiceLocator extends ServiceLoaderFactoryBean {
	
	private ApplicationContext context;
	
	private static volatile DaoServiceLocator instance;
	/** all daos */
	private Map<Dao, Object> daos; 
	
	public static DaoServiceLocator getInstance() {
		if (instance == null) {
			synchronized (DaoServiceLocator.class) {
				if (instance == null) {
					instance = new DaoServiceLocator();
				}
			}
		}
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getDao(Dao dao, Class<T> t) {
		return (T) daos.get(dao);
	}
	
	private DaoServiceLocator() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		daos = new HashMap<Dao, Object>();
		for (Dao dao: Dao.values()) {
			daos.put(dao, context.getBean(dao.getValue()));
		}
	}
	
}
