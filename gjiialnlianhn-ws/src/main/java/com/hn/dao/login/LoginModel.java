package com.hn.dao.login;

import com.hn.dao.GenericModel;

public class LoginModel extends GenericModel{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String userId;
	private String password;
	
	public LoginModel() {}

	public LoginModel(String id, String userId, String password){
	     this.id = id;
	     this.userId = userId;
	     this.password = password;
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
}
