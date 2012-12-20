package com.hn.dao.login;

import com.hn.dao.GenericModel;

public class LoginModel extends GenericModel{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String userId;
	private String roleId;
	private String password;
	private String active;
	
	public LoginModel() {}

	public LoginModel(String id, String userId, String roleId, String password, String active){
	     this.id = id;
	     this.userId = userId;
	     this.roleId = roleId;
	     this.password = password;
	     this.active=active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
