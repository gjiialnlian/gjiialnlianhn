package com.hn.dao.category;

import java.util.List;

import com.hn.dao.GenericDaoImpl;

public class CategoryDaoImpl extends GenericDaoImpl<CategoryModel> implements CategoryDao {
	
	public CategoryDaoImpl() {
		super(new CategoryModel());
	}
	
	@Override
	public List<CategoryModel> getAll() {
		return super.getAll();
	}
	
	@Override
	public void insert(CategoryModel model) {
		super.insert(model);
	}
	
	@Override
	public void update(CategoryModel model) {
		super.update(model);
	}
	
	@Override
	public void delete(CategoryModel model) {
		super.delete(model);
	}
	
	@Override
	public CategoryModel getModelById(CategoryModel model) {
		return super.getModelById(model);
	}
	
}
