package com.hotnews.service.category;

import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.springframework.stereotype.Service;
import com.hotnews.bean.CategoryBean;
import com.hotnews.constant.ServiceOperation;
import com.hotnews.constant.ServiceType;
import com.hotnews.ws.client.ClientManager;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

	@Override
	public List<CategoryBean> getAll() throws JsonParseException {
		
		try {
			List<CategoryBean> list = new ClientManager<CategoryBean>().callGet(ServiceOperation.GETALL.getServiceOperation(ServiceType.CATEGORY)).getResponseList();
			return list;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null;
	}

	
}
