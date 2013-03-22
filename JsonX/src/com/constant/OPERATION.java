package com.constant;

public enum OPERATION {
	ADD("add");
	
	OPERATION(String op){
		this.op=op;
	}
	
	private String op;
	
	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}
}
