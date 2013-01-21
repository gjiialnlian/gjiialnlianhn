package com.hn.constant;

public enum CharacterEnum {
	DOT("."),
	NO("N"),
	YES("Y");
	
	private String string;
	
	CharacterEnum(String string){
		this.string=string;
	}
	
	public String getString(){
		return this.string;
	}
}
