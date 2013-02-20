package com.uni.core.service.impl;

import trash.UserDao1;

import com.uni.core.dto.TeacherDTO;
import com.uni.core.dto.UniGroupDTO;
import com.uni.core.dto.studies.CourcePlanDTO;

public class CourcePlanService {
	
	public void addCource(UniGroupDTO uniGroup, TeacherDTO teacher, CourcePlanDTO courcePlan) {
		UserDao1 dao = new UserDao1();
		dao.save(null);
	}
	
	public void getCurrentCources(UniGroupDTO uniGroup) {
		
	}
	
	public void getCurrentCorces(TeacherDTO teacher) {
		
	}
	
}
