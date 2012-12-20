package com.hn.constant;

import java.io.Serializable;

public enum ResponseStatus implements Serializable{
	
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
