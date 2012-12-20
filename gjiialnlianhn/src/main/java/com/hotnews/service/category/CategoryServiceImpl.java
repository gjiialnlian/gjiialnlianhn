package com.hotnews.service.category;

import java.util.List;

import org.springframework.stereotype.Service;
import com.hotnews.bean.CategoryBean;
import com.hotnews.service.GenericServiceImpl;

@Service("categoryService")
public class CategoryServiceImpl extends GenericServiceImpl<CategoryBean> implements CategoryService{

	public CategoryServiceImpl() {
		super(new CategoryBean());
	}
	
	@Override
	public Integer add(CategoryBean bean) {
		return null;
	}

	@Override
	public Integer edit(CategoryBean bean) {
		return null;
	}

	@Override
	public Integer delete(CategoryBean bean) {
		return null;
	}

	@Override
	public List<CategoryBean> getAll() {
		return super.getAll();
	}
	
	@Override
	public CategoryBean getById(String id) {
		return super.getById(id);
	}

}
