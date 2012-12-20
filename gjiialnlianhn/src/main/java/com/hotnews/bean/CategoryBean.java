package com.hotnews.bean;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.convert.BeanConverter;

@DataTransferObject(converter = BeanConverter.class)
public class CategoryBean extends GenericBean{
	
	private static final long serialVersionUID = 1L;
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
