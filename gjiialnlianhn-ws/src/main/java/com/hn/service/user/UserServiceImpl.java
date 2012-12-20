package com.hn.service.user;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import com.hn.bean.UserBean;
import com.hn.constant.ResponseStatus;
import com.hn.dao.user.UserDao;
import com.hn.dao.user.UserModel;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public Response getAll() {
		List<UserModel> list = userDao.getAll();
		List<UserBean> beanList = new ArrayList<UserBean>();
		
		for(UserModel model : list){
			beanList.add(new UserBean(model.getId(), model.getName(), model.getEmail()));
		}
		
		return Response.ok().entity(beanList).build();
	}

	@Override
	public Response add(UserBean bean) {		
		UserModel model = new UserModel();
		model.setId(bean.getId());
		model.setName(bean.getName());
		model.setEmail(bean.getEmail());
		userDao.insert(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response edit(UserBean bean) {
		UserModel model = new UserModel();
		model.setId(bean.getId());
		model.setName(bean.getName());
		model.setEmail(bean.getEmail());
		userDao.update(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response delete(UserBean bean) {
		UserModel model = new UserModel();
		model.setId(bean.getId());
		userDao.delete(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response getById(String id) {
		UserModel model = new UserModel();
		model.setId(id);
		model = userDao.getModelById(model);
		UserBean bean = new UserBean(model.getId(), model.getName(), model.getEmail());
		return Response.ok().entity(bean).build();
	}
}

