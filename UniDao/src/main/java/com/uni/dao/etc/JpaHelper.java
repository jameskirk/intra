package com.uni.dao.etc;

import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.JpaRepository;

import com.uni.jpa.base.UniGroup;

public class JpaHelper {
	
	private static volatile JpaHelper instance;
	/** all daos */
	private Map<Class<?>, ? super JpaRepository<?, Integer>> daos;
	
//	private JpaRepository<UniGroup, Integer> uniRepository;
	
	public static JpaHelper getInstance() {
		if (instance == null) {
			synchronized (JpaHelper.class) {
				if (instance == null) {
					instance = new JpaHelper();
				}
			}
		}
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public <T> JpaRepository<T, Integer> getRepo(Class<T> t) {
		return (JpaRepository<T, Integer>) daos.get(t);
	}
	
	private JpaHelper() {
		EntityManager em = (EntityManager) new ClassPathXmlApplicationContext("applicationContext-dao.xml").getBean("em");
		daos.put(UniGroup.class, new UniJpaRepository<UniGroup, Integer>(UniGroup.class, em));
	}


}
