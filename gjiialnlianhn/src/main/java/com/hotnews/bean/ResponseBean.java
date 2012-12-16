package com.hotnews.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.ResponseStatus;

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
