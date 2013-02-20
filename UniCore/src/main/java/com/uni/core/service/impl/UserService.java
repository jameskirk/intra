package com.uni.core.service.impl;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uni.core.dto.StudentDTO;
import com.uni.core.dto.TeacherDTO;
import com.uni.core.dto.etc.TimeDTO;
import com.uni.core.dto.security.RegistraionDTO;
import com.uni.core.dto.security.UserAccountDTO;
import com.uni.core.exception.UniError;
import com.uni.core.exception.UniException;
import com.uni.core.service.IUserService;
import com.uni.dao1.IPermissionGroupDao;
import com.uni.dao1.IRegistraionDao;
import com.uni.dao1.IUserAccountDao;
import com.uni.jpa.security.AccountStatus;
import com.uni.jpa.security.PermissionGroup;
import com.uni.jpa.security.Registraion;
import com.uni.jpa.security.UserAccount;

@Service
@Transactional
public class UserService implements IUserService {
	
	private static final String PERMISSION_NEW_USER = "new_user";
	@Autowired
	private Mapper mapper;
	@Autowired
	private IRegistraionDao registraionDao;
	@Autowired
	private IUserAccountDao userAccountDao;
	@Autowired
	private IPermissionGroupDao permissionGroupDao;
	
	@Override
	public void createUserAccount(RegistraionDTO registraion) throws UniException {
		// check if login already exist
		String login = registraion.getUserAccount().getLogin();
		UserAccount userAccount = userAccountDao.findOneBy("login", login);
		if (userAccount != null) {
			throw new UniException(UniError.EU001);
		}
		// fill registration object
		Registraion registrationJ =  getMapper().map(registraion, Registraion.class);
		registrationJ.getUserAccount().setStatus(AccountStatus.NEW);
		
		registraionDao.saveAndFlush(registrationJ);
	}

	@Override
	public List<UserAccountDTO> getAccountsToActivate(int callerId) throws UniException {
		List<UserAccountDTO> retVal = null;
		UserAccount userAccount = userAccountDao.findOne(callerId);
		if (userAccount == null) {
			throw new UniException(UniError.EU001);
		}
//		int facultyId = 
//		registraionDao.getAllByAccStatus(AccountStatus.NEW, facultyID, departmentId);
//		UserAccount userAccount = DaoServiceLocator.getInstance().getUserAccountDao().findOne((long) callerId);
//		Department department;
//		if (userAccount.getRole() == Role.teacher) {
//			DaoServiceLocator.getInstance().getDepartmentDao().findByTeacher(callerId);
//		} else if (userAccount.getRole() == Role.admin) {
////			DaoServiceLocator.getInstance().getDepartmentDao().findByAdmin(callerId)
//		}
		return retVal;
	}

	@Override
	public void activateUserAccount(int callerId, int accountId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createStudent(StudentDTO student, int uniGroupId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createTeacher(TeacherDTO teacher, int departmentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentDTO> getStudentsBуFaculty(int facultyId, TimeDTO time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> getStudentsByDepartment(int departmentId,
			TimeDTO time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> getStudentsByUniGroup(int uniGroupId, TimeDTO time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDTO getStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Mapper getMapper() {
		return mapper;
	}
	

}
