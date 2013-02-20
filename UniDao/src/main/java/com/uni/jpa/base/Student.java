package com.uni.jpa.base;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student extends User {
	
	@ManyToOne
	private UniGroup uniGroup;
	
	@OneToMany
	private List<UniGroup> archivalUniGroups;

}
