package com.hn.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.hn.constant.ResponseStatus;

@JsonIgnoreProperties(ignoreUnknown=true) 
public class ResponseBean {
	ResponseStatus status;

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
}
