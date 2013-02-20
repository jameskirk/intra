package com.uni.core.dto.security;

import java.util.List;

public class PermissionGroupDTO {
	
	private int id;
	
	private String name;
	
	private List<PermissionDTO> permissions;
	
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
	public List<PermissionDTO> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<PermissionDTO> permissions) {
		this.permissions = permissions;
	}
	
	
}
