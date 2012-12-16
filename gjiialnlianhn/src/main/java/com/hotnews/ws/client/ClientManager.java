package com.hotnews.ws.client;

import java.util.List;
import com.hotnews.constant.RequestType;

public class ClientManager<T> extends Client{
	
	T object;
	public ClientManager() {}
	
	public ClientManager(String url, RequestType requestType, T object) {
		super(url, requestType, object);
		this.object=object;
	}
	
	public ClientManager<T> getInstance(){
		return new ClientManager<T>();
	}
	
	public static <T> ClientManager<T> getInstance(String url, RequestType requestType, T object){
		return new ClientManager<T>(url, requestType, object);
	}
	
	public Object getResponseObject(){
		return getResponse();	
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getResponseList(){
		return (List<T>) getResponse();
	}
	
	@SuppressWarnings("unchecked")
	public T getResponseBean(){
		return (T) getResponse();
	}

	public ClientManager<T> callGet(String url, T object){
		return getInstance(url, RequestType.GET, object);
	}
	
	public ClientManager<T> callGet(String url){
		return getInstance(url, RequestType.GET, object);
	}
	
	public ClientManager<T> callPost(String url, T object){
		return getInstance(url, RequestType.POST, object);
	}
}
