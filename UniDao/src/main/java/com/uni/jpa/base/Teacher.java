package com.uni.jpa.base;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Teacher extends User {
	
	@ManyToOne
	private Department department;
	/** just for information */
	
}
