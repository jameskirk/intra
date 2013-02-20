package com.uni.jpa.studies;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Timetable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	/** start date of semester */
	private Date startDate;
	/** end date of semester */
	private Date endDate;
	@ManyToOne
	private CourcePlan courcePlan;
	
	private Date startTime;
	
	private Date endTime;
	
	private String description;
	
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

	public CourcePlan getCourcePlan() {
		return courcePlan;
	}

	public void setCourcePlan(CourcePlan courcePlan) {
		this.courcePlan = courcePlan;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

}