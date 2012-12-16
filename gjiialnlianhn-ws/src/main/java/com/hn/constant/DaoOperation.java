package com.hn.constant;

public enum DaoOperation {
	GETALL("getAll"),
	GETBYID("getById"),
	INSERT("insert"),
	UPDATE("update"),
	DELETE("delete");
	
	private String op;
	
	DaoOperation(String op){
		this.op=op;
	}
	
	public String getDaoOperation(){
		return this.op;
	}
	
	public String getDaoOperation(DaoTable table){
		return table.getDaoTableName().concat(CharacterEnum.DOT.getString()).concat(this.op); 
	}
	
}
