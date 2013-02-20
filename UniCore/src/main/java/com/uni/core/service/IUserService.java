package com.uni.core.service;

import java.util.List;

import com.uni.core.dto.StudentDTO;
import com.uni.core.dto.TeacherDTO;
import com.uni.core.dto.etc.TimeDTO;
import com.uni.core.dto.security.RegistraionDTO;
import com.uni.core.dto.security.UserAccountDTO;
import com.uni.core.exception.UniException;


public interface IUserService {
	
	/* 
	 * User management 
	 */
	
	/** for basic self-registration, may send passport data */
	public void createUserAccount(RegistraionDTO registraionDTO) throws UniException;
	
	public List<UserAccountDTO> getAccountsToActivate(int callerId) throws UniException;
	
	public void activateUserAccount(int callerId, int accountId);
	
	public void createStudent(StudentDTO student, int uniGroupId);
	
	public void createTeacher(TeacherDTO teacher, int departmentId);
	
	
	/* 
	 * View
	 */
	
	public List<StudentDTO> getStudentsBуFaculty(int facultyId, TimeDTO time);
	
	public List<StudentDTO> getStudentsByDepartment(int departmentId, TimeDTO time);
	
	public List<StudentDTO> getStudentsByUniGroup(int uniGroupId, TimeDTO time);
	
	public StudentDTO getStudent(int studentId);
	
	/*
	 * Actions
	 */
	
	/** no update timetable, deadline */  
//	public void updateStudent(StudentDTO student);
	
//	public void undateTeacher(TeacherDTO teacher);
}
