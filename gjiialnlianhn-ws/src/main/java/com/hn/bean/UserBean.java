package com.hn.bean;

public class UserBean extends GenericBean{
	
	private String active;
	private String roleId;
	private String email;

	public UserBean() {}
	
	public UserBean(String id, String roleId, String name, String email, String active) {
		this.setId(id);
		this.setName(name);
		this.active=active;
		this.setRoleId(roleId);
		this.setEmail(email);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}