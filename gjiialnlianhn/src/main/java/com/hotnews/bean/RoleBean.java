package com.hotnews.bean;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.convert.BeanConverter;

@DataTransferObject(converter = BeanConverter.class)
public class RoleBean extends GenericBean{
	
	private static final long serialVersionUID = 1L;

	public RoleBean() {}
	
	public RoleBean(String id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
}
