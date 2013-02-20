package com.uni.core.mapper;

import com.uni.jpa.base.User;

public class UserMapper extends AbstractMapper<User, User> {

	@Override
	public User mapIntoBo(User jpa) {
		User business = new User();
		business.setId(jpa.getId());
		business.setName(jpa.getName());
		business.setDateofBirth(jpa.getDateofBirth());
		business.setDescription(jpa.getDescription());
		business.setPatronymic(jpa.getPatronymic());
		business.setSurname(jpa.getSurname());
		return business;
	}

	@Override
	public User mapFromBo(User businessObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
