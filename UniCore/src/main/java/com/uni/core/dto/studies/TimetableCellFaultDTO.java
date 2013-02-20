package com.uni.core.dto.studies;

import java.util.Date;

import com.uni.core.dto.UserDTO;

public class TimetableCellFaultDTO {
	
	private int id;
	
	private TimetableCellDTO timeTableCell;
	
	private UserDTO submitter;
	
	private Date newStartDate;
	
	private Date newEndDate;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TimetableCellDTO getTimeTableCell() {
		return timeTableCell;
	}

	public void setTimeTableCell(TimetableCellDTO timeTableCell) {
		this.timeTableCell = timeTableCell;
	}

	public UserDTO getSubmitter() {
		return submitter;
	}

	public void setSubmitter(UserDTO submitter) {
		this.submitter = submitter;
	}

	public Date getNewStartDate() {
		return newStartDate;
	}

	public void setNewStartDate(Date newStartDate) {
		this.newStartDate = newStartDate;
	}

	public Date getNewEndDate() {
		return newEndDate;
	}

	public void setNewEndDate(Date newEndDate) {
		this.newEndDate = newEndDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
