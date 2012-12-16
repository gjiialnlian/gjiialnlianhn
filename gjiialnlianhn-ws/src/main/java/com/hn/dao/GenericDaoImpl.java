package com.hn.dao;

import java.util.List;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import com.hn.constant.DaoOperation;
import com.hn.constant.DaoTable;

public abstract class GenericDaoImpl<T> extends SqlMapClientTemplate implements GenericDao<T>{
	
	T m;
	
	public GenericDaoImpl() {}
	
	public GenericDaoImpl(T model) {
		m = model;
	}
	
	@Override
	public void insert(T model){
		insert(DaoOperation.INSERT.getDaoOperation(DaoTable.find(m.getClass().getSimpleName())), model);
	}

	@Override
	public void update(T model) {
		update(DaoOperation.UPDATE.getDaoOperation(DaoTable.find(m.getClass().getSimpleName())), model);
	}

	@Override
	public void delete(T model) {
		delete(DaoOperation.DELETE.getDaoOperation(DaoTable.find(m.getClass().getSimpleName())), model);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		return queryForList(DaoOperation.GETALL.getDaoOperation(DaoTable.find(m.getClass().getSimpleName())));
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getModelById(T model) {
		return (T) queryForObject(DaoOperation.GETBYID.getDaoOperation(DaoTable.find(model.getClass().getSimpleName())), model);
	}
}
