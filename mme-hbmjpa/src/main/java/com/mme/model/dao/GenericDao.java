package com.mme.model.dao;

import java.util.List;

public interface GenericDao<T> {

    /*  CRUD Functionalities  */
    public boolean save(T o);
    public boolean update(T o);
    public boolean delete(T o);
    
    /*  Search Functionalities  */
    public T findById(String id);
    public List<T> findAll(String sql);
}

