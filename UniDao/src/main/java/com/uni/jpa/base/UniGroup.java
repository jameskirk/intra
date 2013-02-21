package com.uni.jpa.base;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SecondaryTable;

@Entity
@NamedQueries({
    @NamedQuery(name="FIND_GROUPS_BY_FACULTY",
                query="SELECT g FROM UniGroup g WHERE g.name = 'gr1'"),
})
@SecondaryTable(name="archival_unigroup")
public class UniGroup {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	/** 5084/13, after year not change (create new group) */
	@Column
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	private Department department;

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
