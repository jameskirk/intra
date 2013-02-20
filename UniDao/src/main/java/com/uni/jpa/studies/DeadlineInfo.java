package com.uni.jpa.studies;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DeadlineInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	@OneToOne
	private CourcePlan courcePlans;
	@Enumerated
	private DeadlineKind kind;
	
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

	public DeadlineKind getKind() {
		return kind;
	}

	public void setKind(DeadlineKind kind) {
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
