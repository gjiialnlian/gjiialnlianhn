package com.hotnews.bean;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import com.hotnews.constant.ResponseStatus;


@JsonIgnoreProperties(ignoreUnknown=true) 
public class ResponseBean implements Serializable{
	private static final long serialVersionUID = 1L;
	ResponseStatus status;

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
}
