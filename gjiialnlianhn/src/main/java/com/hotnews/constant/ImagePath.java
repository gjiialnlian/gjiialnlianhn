package com.hotnews.constant;

import java.io.File;

public enum ImagePath {
	DEFAULT_PATH("C:/WorkZone/www.hotnews.com/images");
	
	private String path;
	private CategoryTable catTable;
	private String itemId;

	ImagePath(String path){
		this.path=path;
	}

	public String getDefaultPath(){
		return this.path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void setCatTable(CategoryTable catTable) {
		this.catTable = catTable;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPath(){
		return this.path+File.separator+this.catTable.getPrefix()+File.separator+this.itemId;
	}
}
