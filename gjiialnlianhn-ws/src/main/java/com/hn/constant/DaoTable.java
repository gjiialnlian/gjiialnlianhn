package com.hn.constant;

public enum DaoTable {
	CATEGORY("category","CategoryModel");
	
	private String name;
	private String mapping;
	
	DaoTable(String name, String mapping){
		this.name=name;
		this.mapping=mapping;
	}
	
	public String getDaoTableName(){
		return this.name;
	}
	
	public String getDaoTableMapping(){
		return this.mapping;
	}
	
	public static DaoTable find(String mapping) {
	    for (DaoTable table : DaoTable.values()) {
	        if (mapping.equalsIgnoreCase(table.mapping)) 
	            return table;
	    }
	    return null;
	}
}
