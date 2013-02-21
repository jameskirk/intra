package com.uni.dao;

public interface PersonDao {
	
//	public void addUniGroup(UniGroup uniGroup, int departmentId);
//	
//	public void addStudent(Student student, int uniGroupId);
//	
//	public void addTeacher(Teacher teacher, Subject subject);
//	
//	public void deleteStudent(int StudentId);
//	
//	public void deleteTeacher(int TeacherId);
//	
//	public void getUniGroup(int id);
	
	public <T> void addSomething1(T source, Class<T> type);
	
	public <T> T getSomething(int id, Class<T> t);
	
	public <T> void deleteSomething(int id, Class<T> t);
	
	public <T> void updateSomething(T source, Class<T> t);
	
}
