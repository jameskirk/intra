package com.uni.core.dto;

import java.sql.Date;
import java.util.List;

import com.uni.core.dto.studies.CourcePlanDTO;
import com.uni.core.dto.studies.DeadLineInfoDTO;
import com.uni.core.dto.studies.TimetableCellFaultDTO;
import com.uni.core.dto.studies.TimetableDTO;

public class UniGroupDTO extends UniGroupBasicDTO{
	
	private TimetableDTO timetable;
	/** for example teacher is ill */
	private List<TimetableCellFaultDTO> timetableFaults; 
	
	private List<DeadLineInfoDTO> deadLines;
	
	private List<CourcePlanDTO> courcePlans;
	
	private Date startDate;
	
	private Date endDate;

	public TimetableDTO getTimetable() {
		return timetable;
	}

	public void setTimetable(TimetableDTO timetable) {
		this.timetable = timetable;
	}

	public List<DeadLineInfoDTO> getDeadLines() {
		return deadLines;
	}

	public void setDeadLines(List<DeadLineInfoDTO> deadLines) {
		this.deadLines = deadLines;
	}

	public List<TimetableCellFaultDTO> getTimetableFaults() {
		return timetableFaults;
	}

	public void setTimetableFaults(List<TimetableCellFaultDTO> timetableFaults) {
		this.timetableFaults = timetableFaults;
	}

	public List<CourcePlanDTO> getCourcePlans() {
		return courcePlans;
	}

	public void setCourcePlans(List<CourcePlanDTO> courcePlans) {
		this.courcePlans = courcePlans;
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
	
	
}
