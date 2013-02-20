package com.uni.core.dto;

import java.util.List;

public class TeacherDTO extends UserDTO {
	/** just for information */
	private List<SubjectDTO> subjects;
	
	public List<SubjectDTO> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectDTO> subjects) {
		this.subjects = subjects;
	}
	
	
	
}
