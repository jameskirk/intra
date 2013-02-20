package com.uni.dao;

import com.uni.jpa.base.Department;
import com.uni.jpa.base.Faculty;
import com.uni.jpa.base.Student;
import com.uni.jpa.base.Teacher;
import com.uni.jpa.base.UniGroup;

public enum ThingKind {
	FACULTY(Faculty.class), DEPARTMENT(Department.class), UNI_GROUP(UniGroup.class),
	STUDENT(Student.class), TEACHER(Teacher.class);
	
	private Class value;
	
	private ThingKind(Class value) {
		this.value = value;
	}
	
	public Class getValue() {
		return value;
	}

}
