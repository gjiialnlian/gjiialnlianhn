package com.hn.service;

import javax.ws.rs.core.Response;

public interface GenericService<T> {
	
	String GET_ALL =	"/getAll/";
	String ADD =	"/add/";
	String EDIT =	"/edit/";
	String DELETE =	"/delete/";
	String GET_BY_ID =	"/getById/{id}";
	
	Response getAll();
    Response add(T bean);
    Response edit(T bean);
    Response delete(T bean);
    Response getById(String id);
}

