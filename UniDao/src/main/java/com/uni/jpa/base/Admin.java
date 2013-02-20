package com.uni.jpa.base;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Admin extends User {
	
	@OneToOne
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
