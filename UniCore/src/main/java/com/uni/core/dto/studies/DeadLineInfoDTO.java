package com.uni.core.dto.studies;

import java.util.Date;

import com.uni.jpa.studies.CourcePlan;

public class DeadLineInfoDTO {
	
	private int id;
	
	private String name;
	
	private CourcePlan courcePlans;
	
	private DeadLineKindDTO kind;
	
	private Date endDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeadLineKindDTO getKind() {
		return kind;
	}

	public void setKind(DeadLineKindDTO kind) {
		this.kind = kind;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public CourcePlan getCourcePlans() {
		return courcePlans;
	}

	public void setCourcePlans(CourcePlan courcePlans) {
		this.courcePlans = courcePlans;
	}
	
	
}
