package com.hotnews.constant;

public enum ServiceOperation {
	GETALL("getAll"),
	GETBYID("getById"),
	INSERT("insert"),
	UPDATE("update"),
	DELETE("delete");
	
	private String op;
	
	ServiceOperation(String op){
		this.op=op;
	}
	
	public String getServiceOperation(){
		return this.op;
	}
	
	public String getServiceOperation(ServiceType type){
		return type.getServiceName().concat(CharacterEnum.FSLASH.getString()).concat(this.op); 
	}
	
}
