package com.hn.dao.category;

import com.hn.dao.GenericDaoImpl;

public class CategoryDaoImpl extends GenericDaoImpl<CategoryModel> implements CategoryDao {
	
	public CategoryDaoImpl() {
		super(new CategoryModel());
	}
}
