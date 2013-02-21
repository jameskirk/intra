package com.uni.core.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.dozer.Mapper;
import org.dozer.MappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uni.core.dto.StudentDTO;
import com.uni.core.dto.UniGroupDTO;
import com.uni.core.exception.UniException;
import com.uni.core.service.IUniService;
import com.uni.dao.UniDao;
import com.uni.dao.etc.DaoException;
import com.uni.jpa.base.Student;
import com.uni.jpa.base.UniGroup;

@Service
@Transactional
public class UniService implements IUniService {

	@Autowired
	private Mapper mapper;
	@Autowired
	private UniDao uniDao;
	// dto, entity
	private Map<Class<?>, Class<?>> map;
	
	public UniService() {
		map = new HashMap<Class<?>, Class<?>>();
		map.put(UniGroupDTO.class, UniGroup.class);
		map.put(StudentDTO.class, Student.class);
	}
	
	
	@Override
	public <T> void addSomething(T source, Class<T> type) throws UniException {
		try {
			Class<?> entityClass = map.get(type);
			uniDao.addSomething(mapper.map(source, entityClass), entityClass);
		} catch (DaoException e) {
			System.out.println("dao errr");
			e.printStackTrace();
		}
		
	}


	@Override
	public <T> T getSomething(int id, Class<T> type) throws UniException {
		try {
			Class<?> entityClass = map.get(type);
			if (entityClass == null) {
				throw new UniException(null);
			}
			Object source = uniDao.getSomething(id, entityClass);
			if (source == null) {
				return null;
			}
			return (T) mapper.map(new Object(), type);
		} catch (DaoException e) {
			System.out.println("dao err");
			e.printStackTrace();
			throw new UniException(null);
		} catch (MappingException e) {
			System.out.println("map err");
			throw new UniException(null);
		}
	}

}
