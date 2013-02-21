package com.uni.jpa.base;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student extends User {
	
	@ManyToOne
	private UniGroup uniGroup;
	
	@ManyToMany
	private List<UniGroup> archivalUniGroups;

	public UniGroup getUniGroup() {
		return uniGroup;
	}

	public void setUniGroup(UniGroup uniGroup) {
		this.uniGroup = uniGroup;
	}

	public List<UniGroup> getArchivalUniGroups() {
		return archivalUniGroups;
	}

	public void setArchivalUniGroups(List<UniGroup> archivalUniGroups) {
		this.archivalUniGroups = archivalUniGroups;
	}
	
}
