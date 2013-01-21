package com.hn.constant;

public enum CategoryTable {
	ANIME("AN","anime"),
	HEALTH("HL","health"),
	MOVIES("MO","movies"),
	NEWS("NW","news"),
	SCANDALS("SC","scandals"),
	SHOWBIZ("SW","showbiz"),
	SONGS("SO","songs"),
	SPORTS("SP","sports");
	
	private String prefix;
	private String mapping;
	
	CategoryTable(String prefix, String mapping){
		this.prefix=prefix;
		this.mapping=mapping;
	}
	
	public String getPrefix(){
		return this.prefix;
	}
	
	public static CategoryTable find(String mapping) {
	    for (CategoryTable table : CategoryTable.values()) {
	        if (mapping.equalsIgnoreCase(table.mapping)) 
	            return table;
	    }
	    return null;
	}

	public String getMapping() {
		return mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
}
