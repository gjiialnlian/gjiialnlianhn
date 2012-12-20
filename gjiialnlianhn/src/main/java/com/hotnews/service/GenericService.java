package com.hotnews.service;

import java.util.List;

public interface GenericService<T> {
	List<T> getAll();
    Integer add(T bean);
    Integer edit(T bean);
    Integer delete(T bean);
    T getById(String id);
}

