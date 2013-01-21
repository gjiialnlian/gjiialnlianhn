package com.hotnews.service;

import java.util.List;

import com.hotnews.bean.GenericBean;
import com.hotnews.constant.CharacterEnum;
import com.hotnews.constant.ServiceOperation;
import com.hotnews.constant.ServiceType;
import com.hotnews.ws.client.ClientManager;

public abstract class GenericServiceImpl<T> implements GenericService<T> {

	T b;
	
	public GenericServiceImpl() {}
	
	public GenericServiceImpl(T b) {
		this.b = b;
	}
	
	@Override
	public List<T> getAll() {
		return new ClientManager<T>().callGet(ServiceOperation.GETALL.getServiceOperation(ServiceType.find(b.getClass().getSimpleName()))).getResponseList();
	}
	
	@Override
	public T getById(String id) {	
		return new ClientManager<T>().callGet(ServiceOperation.GETBYID.getServiceOperation(ServiceType.find(b.getClass().getSimpleName())).concat(CharacterEnum.FSLASH.getString()).concat(id),b).getResponseBean();
	}
	
	@Override
	public Integer add(T bean) {	
		return ((GenericBean) new ClientManager<T>().callPost(ServiceOperation.INSERT.getServiceOperation(ServiceType.find(b.getClass().getSimpleName())),bean).getResponseBean()).getStatus().getResponseStatus();
	}
}

