package com.hn.service.login;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import com.hn.bean.LoginBean;
import com.hn.constant.ResponseStatus;
import com.hn.dao.login.LoginDao;
import com.hn.dao.login.LoginModel;

public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public Response getAll() {
		List<LoginModel> list = loginDao.getAll();
		List<LoginBean> beanList = new ArrayList<LoginBean>();
		
		for(LoginModel model : list){
			beanList.add(new LoginBean(model.getId(), model.getUserId(), model.getRoleId(), model.getPassword(), model.getActive()));
		}
		
		return Response.ok().entity(beanList).build();
	}

	@Override
	public Response add(LoginBean bean) {		
		LoginModel model = new LoginModel();
		model.setId(bean.getId());
		model.setUserId(bean.getUserId());
		model.setRoleId(bean.getRoleId());
		model.setPassword(bean.getPassword());
		model.setActive(bean.getActive());
		loginDao.insert(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response edit(LoginBean bean) {
		LoginModel model = new LoginModel();
		model.setId(bean.getId());
		model.setUserId(bean.getUserId());
		model.setRoleId(bean.getRoleId());
		model.setPassword(bean.getPassword());
		model.setActive(bean.getActive());
		loginDao.update(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response delete(LoginBean bean) {
		LoginModel model = new LoginModel();
		model.setId(bean.getId());
		loginDao.delete(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response getById(String id) {
		LoginModel model = new LoginModel();
		model.setId(id);
		model = loginDao.getModelById(model);
		LoginBean bean = new LoginBean(model.getId(), model.getUserId(),model.getRoleId(), model.getPassword(), model.getActive());
		return Response.ok().entity(bean).build();
	}
}

