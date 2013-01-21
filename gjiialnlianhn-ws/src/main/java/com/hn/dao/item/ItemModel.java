package com.hn.dao.item;

import com.hn.dao.GenericModel;

public class ItemModel extends GenericModel{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String catId;
	private String description;
	private String url;
	private int active;
	
	public ItemModel() {}

	public ItemModel(String id, String catId, String description, String url, int active){
	     this.id = id;
	     this.catId = catId;
	     this.description = description;
	     this.url=url;
	     this.active=active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
}
