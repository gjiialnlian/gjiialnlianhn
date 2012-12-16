package com.hn.constant;

public enum ResponseStatus {
	
	FAILED(0),
	PASSED(1);
	
	private int status;
	
	ResponseStatus(int status){
		this.status=status;
	}
	
	public int getResponseStatus(){
		return this.status;
	}
}
