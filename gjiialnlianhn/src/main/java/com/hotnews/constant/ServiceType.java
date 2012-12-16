package com.hotnews.constant;

public enum ServiceType {
	CATEGORY("category");
	
	private String name;
	
	ServiceType(String name){
		this.name=name;
	}
	
	public String getServiceName(){
		return this.name;
	}
	
	public static ServiceType find(String name) {
	    for (ServiceType table : ServiceType.values()) {
	        if (name.equalsIgnoreCase(table.name)) 
	            return table;
	    }
	    return null;
	}
}
