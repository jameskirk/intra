package com.uni.core.dto.security;

import java.util.Date;

public class RegistraionDTO {

	private int id;

	private UserAccountDTO userAccount;
	
	private Date dateOfBirth;
	
	private String passportNo;

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
}
