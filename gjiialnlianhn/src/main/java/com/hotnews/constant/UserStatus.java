package com.hotnews.constant;

import java.io.Serializable;

public enum UserStatus implements Serializable{
	
	INACTIVE(0),
	ACTIVE(1);
	
	private int status;
	
	UserStatus(int status){
		this.status=status;
	}
	
	public int getUserStatus(){
		return this.status;
	}
	
	public String getUserStatusStr(){
		return String.valueOf(this.status);
	}
}
