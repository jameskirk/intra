package com.uni.core.service;

import java.util.List;

import com.uni.core.dto.UniGroupBasicDTO;
import com.uni.core.dto.UniGroupDTO;
import com.uni.core.dto.etc.TimeDTO;

public interface IUniStructureService {
	
	/** entry point- create uniGroup */
	public void createUniGroup(UniGroupDTO uniGroup, int departmentId);
	
	/** page group list of faculty or department */
	public List<UniGroupBasicDTO> getUniGroups(int departmentId, TimeDTO time);
	
	/** page group detail, for example - timetable, deadlines of group */
	public UniGroupDTO getUniGroup(int uniGroupId);
	
	public void prepareTransferNextSemester(List<Long> departmentsId, List<Long> studentsId);
	
	public void executeTransferNextSemester(List<Long> departmentsId, List<Long> studentsId);
	
}
