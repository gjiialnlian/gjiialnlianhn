package com.hn.service.category;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import com.hn.bean.CategoryBean;
import com.hn.constant.CharacterEnum;
import com.hn.constant.ResponseStatus;
import com.hn.dao.category.CategoryDao;
import com.hn.dao.category.CategoryModel;

public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public Response getAll() {
		List<CategoryModel> list = categoryDao.getAll();
		List<CategoryBean> beanList = new ArrayList<CategoryBean>();
		
		for(CategoryModel model : list){
			beanList.add(new CategoryBean(model.getId(),model.getName(),model.getDescription(),null));
		}
		
		return Response.ok().entity(beanList).build();
	}

	@Override
	public Response add(CategoryBean bean) {		
		CategoryModel model = new CategoryModel();
		model.setId(bean.getId());
		model.setName(bean.getName());
		model.setDescription(bean.getDescription());
		model.setActive(bean.getActive().equals(CharacterEnum.YES.getString())?1:0);
		categoryDao.insert(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response edit(CategoryBean bean) {
		CategoryModel model = new CategoryModel();
		model.setId(bean.getId());
		model.setName(bean.getName());
		model.setDescription(bean.getDescription());
		model.setActive(bean.getActive().equals("Y")?1:0);
		categoryDao.update(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response delete(CategoryBean bean) {
		CategoryModel model = new CategoryModel();
		model.setId(bean.getId());
		categoryDao.delete(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response getById(String id) {
		CategoryModel model = new CategoryModel();
		model.setId(id);
		model = categoryDao.getModelById(model);
		CategoryBean bean = new CategoryBean(model.getId(),model.getName(),model.getDescription(),null);
		return Response.ok().entity(bean).build();
	}
}

