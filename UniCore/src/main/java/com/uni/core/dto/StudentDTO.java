package com.uni.core.dto;

import java.util.List;

import com.uni.core.dto.studies.DeadLineDTO;

public class StudentDTO extends UserDTO {
	
	private List<DeadLineDTO> deadLines;

	public List<DeadLineDTO> getDeadLines() {
		return deadLines;
	}

	public void setDeadLines(List<DeadLineDTO> deadLines) {
		this.deadLines = deadLines;
	}
	
}
