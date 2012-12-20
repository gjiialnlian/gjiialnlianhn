package com.hn.bean;

public class LoginBean extends GenericBean{
	
	private static final long serialVersionUID = 1L;
	private String userId;
	private String roleId;
	private String password;
	private String active;

	public LoginBean() {}
	
	public LoginBean(String id, String userId, String roleId, String password, String active) {
		this.setId(id);
		this.userId=userId;
		this.roleId=roleId;
		this.password=password;
		this.active=active;
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
