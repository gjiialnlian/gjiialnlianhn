package com.hotnews.constant;

public enum ServiceType {
	CATEGORY("category","CategoryBean"),
	USER("user","UserBean"),
	LOGIN("login","LoginBean"),
	ROLE("role","RoleBean");
	
	private String name;
	private String mapping;
	
	ServiceType(String name, String mapping){
		this.name=name;
		this.mapping=mapping;
	}
	
	public String getServiceName(){
		return this.name;
	}
	
	public String getMapping() {
		return mapping;
	}

	public static ServiceType find(String mapping) {
	    for (ServiceType table : ServiceType.values()) {
	    	 if (mapping.equalsIgnoreCase(table.mapping)) 
	            return table;
	    }
	    return null;
	}
}
