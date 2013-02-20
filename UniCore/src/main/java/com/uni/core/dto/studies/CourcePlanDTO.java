package com.uni.core.dto.studies;

import java.util.List;

import com.uni.core.dto.SubjectDTO;
import com.uni.core.dto.TeacherDTO;
import com.uni.core.dto.etc.TimeDTO;

public class CourcePlanDTO {

	private int id;
	
	private SubjectDTO subject;
	
	private List<TeacherDTO> teachers;
	
	private TimeDTO time;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SubjectDTO getSubject() {
		return subject;
	}

	public void setSubject(SubjectDTO subject) {
		this.subject = subject;
	}

	public List<TeacherDTO> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherDTO> teachers) {
		this.teachers = teachers;
	}

	public TimeDTO getTime() {
		return time;
	}

	public void setTime(TimeDTO time) {
		this.time = time;
	}

}
