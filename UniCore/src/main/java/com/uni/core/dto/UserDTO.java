package com.uni.core.dto;

import java.util.Date;

import com.uni.core.dto.security.UserAccountDTO;

public class UserDTO {
	
	private int id;
	
	private UserAccountDTO userAccount;
	
	private String name;
	
	private String surname;
	
	private String patronymic;
	
	private Date dateofBirth;
	
//	private Image photo;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserAccountDTO getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccountDTO userAccount) {
		this.userAccount = userAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
