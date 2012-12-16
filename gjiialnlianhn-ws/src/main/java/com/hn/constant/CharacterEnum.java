package com.hn.constant;

public enum CharacterEnum {
	DOT("."),
	YES("Y");
	
	private String string;
	
	CharacterEnum(String string){
		this.string=string;
	}
	
	public String getString(){
		return this.string;
	}
}
