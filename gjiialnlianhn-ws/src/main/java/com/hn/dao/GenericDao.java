package com.hn.dao;

import java.util.List;

public interface GenericDao<T> {
	public List<T> getAll();
	public T getModelById(T model);
	public void insert(T model);
	public void update(T model);
	public void delete(T model);
}


