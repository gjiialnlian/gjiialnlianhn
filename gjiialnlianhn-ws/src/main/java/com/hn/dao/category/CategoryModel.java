package com.hn.dao.category;

import com.hn.dao.GenericModel;

public class CategoryModel extends GenericModel{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String description;
	private int active;
	
	public CategoryModel() {}

	public CategoryModel(String id, String name, String description, int active){
	     this.id = id;
	     this.name = name;
	     this.description = description;
	     this.active=active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
}
