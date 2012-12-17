package com.hn.dao.user;

import com.hn.dao.GenericModel;

public class UserModel extends GenericModel{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String roleId;
	private String name;
	private String email;
	private int active;
	
	public UserModel() {}

	public UserModel(String id, String roleId, String name, String email, int active){
	     this.id = id;
	     this.roleId = roleId;
	     this.name = name;
	     this.email=email;
	     this.active=active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
}
