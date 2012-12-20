package com.hotnews.bean;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.convert.BeanConverter;

@DataTransferObject(converter = BeanConverter.class)
public class LoginBean extends GenericBean{

	private static final long serialVersionUID = 1L;
	private String userId;
	private String password;

	public LoginBean() {}
	
	public LoginBean(String id, String userId, String password) {
		this.setId(id);
		this.userId=userId;
		this.password=password;
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
