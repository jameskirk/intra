package com.uni.core.dto.studies;

import java.util.Date;

public class TimetableCellDTO {
	
	private int id;
	
	private Date startDate;
	
	private Date endDate;
	
	private CourcePlanDTO courcePlan;
	
	private String room;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public CourcePlanDTO getCourcePlan() {
		return courcePlan;
	}

	public void setCourcePlan(CourcePlanDTO courcePlan) {
		this.courcePlan = courcePlan;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
	

}
