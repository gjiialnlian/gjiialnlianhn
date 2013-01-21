package com.hotnews.bean;

public class ItemBean extends GenericBean{
	
	private static final long serialVersionUID = 1L;
	private String catId;
	private String description;
	private String url;
	private String active;

	public ItemBean() {}
	
	public ItemBean(String id, String catId, String description, String url, String active) {
		this.setId(id);
		this.catId=catId;
		this.description=description;
		this.url=url;
		this.active=active;
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

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
}
