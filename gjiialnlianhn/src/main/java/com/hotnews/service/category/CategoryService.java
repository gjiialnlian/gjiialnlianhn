package com.hotnews.service.category;

import java.util.List;
import org.codehaus.jackson.JsonParseException;

import com.hotnews.bean.CategoryBean;

public interface CategoryService {

	List<CategoryBean> getAll() throws JsonParseException;
	
}
