package com.hotnews.dwr;

import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.directwebremoting.annotations.Param;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotnews.bean.CategoryBean;
import com.hotnews.service.category.CategoryService;


@Service(value = "CategoryDWR")
@RemoteProxy(
		name = "CategoryDWR",
		creator = SpringCreator.class,
		creatorParams = @Param(name = "beanName", value = "CategoryDWR")
)
public class CategoryDWR{
	
	@Autowired
	private CategoryService categoryService;
	
	@RemoteMethod
	public List<CategoryBean> getRecord(){	
		try {
			return categoryService.getAll();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
