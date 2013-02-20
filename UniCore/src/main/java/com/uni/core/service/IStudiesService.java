package com.uni.core.service;

import java.util.List;

import com.uni.core.dto.SubjectDTO;
import com.uni.core.dto.etc.TimeDTO;
import com.uni.core.dto.studies.CourcePlanDTO;

public interface IStudiesService {
	
	/*
	 * Create
	 */
	public void createSubject(SubjectDTO subject);
	
	public void createCourcePlan(CourcePlanDTO courcePlan);
	
	/*
	 * View
	 */
	public List<CourcePlanDTO> getCourcePlansByFaculty(int facultyId, TimeDTO time);

}
