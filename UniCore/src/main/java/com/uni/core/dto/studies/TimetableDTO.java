package com.uni.core.dto.studies;

import java.util.Date;
import java.util.List;

public class TimetableDTO {
	
	private int id;
	/** start date of semester */
	private Date startDate;
	/** end date of semester */
	private Date endDate;
	
	private List<TimetableCellDTO> cells;
	
	private String description;

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

	public List<TimetableCellDTO> getCells() {
		return cells;
	}

	public void setCells(List<TimetableCellDTO> cells) {
		this.cells = cells;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
