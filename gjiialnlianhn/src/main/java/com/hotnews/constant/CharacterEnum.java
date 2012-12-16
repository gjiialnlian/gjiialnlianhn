package com.hotnews.constant;

public enum CharacterEnum {
	DOT("."),
	YES("Y"),
	FSLASH("/");
	
	private String string;
	
	CharacterEnum(String string){
		this.string=string;
	}
	
	public String getString(){
		return this.string;
	}
}
