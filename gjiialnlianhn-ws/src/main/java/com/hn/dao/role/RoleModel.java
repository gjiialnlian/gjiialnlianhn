package com.hn.dao.role;

import com.hn.dao.GenericModel;

public class RoleModel extends GenericModel{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String description;
	
	public RoleModel() {}

	public RoleModel(String id, String description){
	     this.id = id;
	     this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
