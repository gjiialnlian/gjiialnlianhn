package org.mmedev.rs.service;

import java.net.URL;

import javax.ws.rs.core.Response;
import javax.xml.namespace.QName;
import org.mmedev.rs.model.MyAccount;

public abstract class GenericSvc<T,PT> {
	
	protected URL wsdlURL;
	protected QName SERVICE_NAME;
	protected String message = "OK";
	protected int result = 200;
	protected PT SERVICE_PORT = null;
	
	public GenericSvc(URL wsdlURL, QName SERVICE_NAME) {
		this.wsdlURL=wsdlURL;
		this.SERVICE_NAME=SERVICE_NAME;
	}
	
	public Response generateProcessResponse(MyAccount bean, Integer result, String message){
		Response response = null;

		if (result > 0)
			response = Response.ok().entity(bean).build();
		else 
			response = Response.serverError().entity(result).build();
			
		return response;
	}
	
	public void connectToWS(){
		if(this.wsdlURL == null)
			throw new NullPointerException("WSDL is NULL");
		else if(this.SERVICE_NAME == null)
			throw new NullPointerException("SERVICE_NAME is NULL");
		
		SERVICE_PORT = getHttpPortType();
	}
	
	public abstract PT getHttpPortType();
	
	public URL getWsdlURL() {
		return wsdlURL;
	}

	public void setWsdlURL(URL wsdlURL) {
		this.wsdlURL = wsdlURL;
	}
}
