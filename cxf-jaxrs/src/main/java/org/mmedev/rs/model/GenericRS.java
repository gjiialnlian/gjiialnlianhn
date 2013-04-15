package org.mmedev.rs.model;

import java.io.Serializable;

public class GenericRS implements Serializable{

	private static final long serialVersionUID = 1098434765421323L;
	
	private String responseMessage;
	private String responseCode;
	private String responseResult;
	
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseResult() {
		return responseResult;
	}
	public void setResponseResult(String responseResult) {
		this.responseResult = responseResult;
	}
}
