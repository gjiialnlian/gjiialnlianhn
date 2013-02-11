package com.hotnews.bean;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.convert.BeanConverter;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@DataTransferObject(converter = BeanConverter.class)
public class UploadItem{
	
	  private String name;
	  private CommonsMultipartFile fileData;
	 
	  public String getName(){
	    return name;
	  }
	 
	  public void setName(String name){
	    this.name = name;
	  }
	 
	  public CommonsMultipartFile getFileData(){
	    return fileData;
	  }
	 
	  public void setFileData(CommonsMultipartFile fileData){
	    this.fileData = fileData;
	  }
}
