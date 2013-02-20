package com.uni.jpa.base;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UniGroup {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	/** 5084/13, after year not change (create new group) */
	@Column
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	private Department department;
//	@OneToOne
//	private Timetable timetable;

	private int semester;
	
	private int year;
	
	private boolean firtPartYear;
	
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

//	public Timetable getTimetable() {
//		return timetable;
//	}
//
//	public void setTimetable(Timetable timetable) {
//		this.timetable = timetable;
//	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isFirtPartYear() {
		return firtPartYear;
	}

	public void setFirtPartYear(boolean firtPartYear) {
		this.firtPartYear = firtPartYear;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
