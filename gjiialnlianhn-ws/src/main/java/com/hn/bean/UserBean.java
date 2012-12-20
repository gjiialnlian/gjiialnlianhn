package com.hn.bean;

public class UserBean extends GenericBean{
	
	private static final long serialVersionUID = 1L;
	private String email;

	public UserBean() {}
	
	public UserBean(String id, String name, String email) {
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
