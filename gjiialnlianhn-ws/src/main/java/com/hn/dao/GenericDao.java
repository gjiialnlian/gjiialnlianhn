package com.hn.dao;

import java.util.List;

public interface GenericDao<T> {
	List<T> getAll();
	T getModelById(T model);
	void insert(T model);
	void update(T model);
	void delete(T model);
}


