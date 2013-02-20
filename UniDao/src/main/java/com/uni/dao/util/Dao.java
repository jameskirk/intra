package com.uni.dao.util;


public enum Dao {
	/** structure university */
	FACULTY("facultyDao"),
	DEPARTMENT("departmentDao"),
	UNI_GROUP("uniGroupDao"),
	
	/** user kind */
	USER("userDao"),
	STUDENT("studentDao"),
	TEACHER("teacherDao"),
	
	/** study */
	SUBJECT("subjectDao"),
	COURCE_PLAN("courcePlanDao"),
	DEADLINE("deadlineDao"),
	DEADLINE_INFO("deadlineInfoDao"),
	
	/** timetable */
	TIMETABLE("timetableDao"),
	TIMETABLE_CELL("timetableCellDao"),
	TIMETABLE_CELL_DETAILS("timetableCellDetailsDao"),
	
	/** security */
	USER_ACCOUNT("userAccountDao"),
	PERMISSION("permissionDao"),
	PERMISSION_GROUP("permissionGroupDao"),
	REGISTRAION("registraionDao");
	
	private String value;
	
	private Dao(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
