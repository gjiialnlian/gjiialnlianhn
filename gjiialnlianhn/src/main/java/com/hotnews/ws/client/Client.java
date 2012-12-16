package com.hotnews.ws.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.MappingJsonFactory;

import com.hotnews.constant.RequestType;

public abstract class Client {
	
	String WEB_APP = "http://localhost:8080/hotnews-ws/";
	String endpointUrl;
	WebClient client;
	Response response;
	RequestType requestType;
	Object object;
	
	public Client() {}
	
	public Client(String url, RequestType requestType, Object object) {
		this.endpointUrl = WEB_APP+url;
		this.object = object;
		createConnection();
		createRequest(requestType);
	}
	
	public void createConnection(){
		List<Object> providers = new ArrayList<Object>();
	    providers.add(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());
		client = WebClient.create(endpointUrl, providers);
	}
	
	public void createRequest(RequestType requestType){
		
		switch (requestType) {
		case GET:
			response = client.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get();	
			break;
		case POST:
			response = client.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(object);
			break;	
		default:
			break;
		}
	}
	
	public Object getResponse(){
		MappingJsonFactory factory = new MappingJsonFactory();
		JsonParser parser;
		try {
			parser = factory.createJsonParser((InputStream)response.getEntity());
			return parser.readValueAs(Object.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
