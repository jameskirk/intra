package com.uni.core.dto.security;

public class UserAccountDTO {
	
	private int id;
	
	private String login;
	
	private String password;
	
	private PermissionGroupDTO permissionGroup;
	
	private RoleDTO role;
	
	private AccountStatusDTO status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public PermissionGroupDTO getPermissionGroup() {
		return permissionGroup;
	}

	public void setPermissionGroup(PermissionGroupDTO permissionGroup) {
		this.permissionGroup = permissionGroup;
	}

	public RoleDTO getRole() {
		return role;
	}

	public void setRole(RoleDTO role) {
		this.role = role;
	}

	public AccountStatusDTO getStatus() {
		return status;
	}

	public void setStatus(AccountStatusDTO status) {
		this.status = status;
	}
	
}
