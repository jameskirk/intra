package com.uni.core.service.impl;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.uni.core.dto.UniGroupBasicDTO;
import com.uni.core.dto.UniGroupDTO;
import com.uni.core.dto.etc.TimeDTO;
import com.uni.core.service.IUniStructureService;
import com.uni.dao.util.Dao;
import com.uni.dao.util.DaoServiceLocator;
import com.uni.dao1.IDepartmentDao;
import com.uni.dao1.IStudentDao;
import com.uni.dao1.ITeacherDao;
import com.uni.dao1.IUniGroupDao;
import com.uni.dao1.IUserDao;
import com.uni.dao1.impl.DepartmentDao;

@Service
@Transactional
public class UniStructureService implements IUniStructureService {
	@Autowired
	private Mapper mapper;
	
	// TODO: resolve: is the adding students need? no
//	public void addUniGroup(UniGroupDTO uniGroup, String departmentName) throws UniException {
//		Department department = getDepartmentDao().findByName(departmentName);
//		if (department == null) {
//			throw new UniException(UniError.ES001);
//		}
//		UniGroup uniGroupJ = getMapper().map(uniGroup, UniGroup.class);
//		department.getGroups().add(uniGroupJ);
//		getDepartmentDao().saveAndFlush(department);
//	}
	
	public Mapper getMapper() {
		return mapper;
	}
	
	public IUserDao getUserDao() {
		return DaoServiceLocator.getInstance().getDao(Dao.USER, IUserDao.class);
	}
	
	public IStudentDao getStudentDao() {
		return DaoServiceLocator.getInstance().getDao(Dao.STUDENT, IStudentDao.class);
	}
	
	public ITeacherDao getTeacherDao() {
		return DaoServiceLocator.getInstance().getDao(Dao.TEACHER, ITeacherDao.class);
	}
	
	public IUniGroupDao getUniGroupDao() {
		return DaoServiceLocator.getInstance().getDao(Dao.UNI_GROUP, IUniGroupDao.class);
	}
	
	public IDepartmentDao getDepartmentDao() {
		return DaoServiceLocator.getInstance().getDao(Dao.DEPARTMENT, DepartmentDao.class);
	}

	@Override
	public void createUniGroup(UniGroupDTO uniGroup, int departmentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UniGroupDTO getUniGroup(int departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prepareTransferNextSemester(List<Long> departmentsId,
			List<Long> studentsId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeTransferNextSemester(List<Long> departmentsId,
			List<Long> studentsId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UniGroupBasicDTO> getUniGroups(int departmentId, TimeDTO time) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
