package com.hotnews.bean;

public class CategoryBean extends GenericBean{
	
	private String active;

	public CategoryBean() {}
	
	public CategoryBean(String id, String name, String description, String active) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
		this.active=active;
	}
	
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
}
