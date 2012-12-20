package com.hn.bean;

public class RoleBean extends GenericBean{

	private static final long serialVersionUID = 1L;

	public RoleBean() {}
	
	public RoleBean(String id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
}
