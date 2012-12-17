package com.hn.service.role;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;

import com.hn.bean.RoleBean;
import com.hn.bean.UserBean;
import com.hn.constant.CharacterEnum;
import com.hn.constant.ResponseStatus;
import com.hn.dao.role.RoleDao;
import com.hn.dao.role.RoleModel;
import com.hn.dao.user.UserDao;
import com.hn.dao.user.UserModel;

public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public Response getAll() {
		List<RoleModel> list = roleDao.getAll();
		List<RoleBean> beanList = new ArrayList<RoleBean>();
		
		for(RoleModel model : list){
			beanList.add(new RoleBean(model.getId(), model.getDescription()));
		}
		
		return Response.ok().entity(beanList).build();
	}

	@Override
	public Response add(RoleBean bean) {		
		RoleModel model = new RoleModel();
		model.setId(bean.getId());
		model.setDescription(bean.getDescription());
		roleDao.insert(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response edit(RoleBean bean) {
		RoleModel model = new RoleModel();
		model.setId(bean.getId());
		model.setDescription(bean.getDescription());
		roleDao.update(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response delete(RoleBean bean) {
		RoleModel model = new RoleModel();
		model.setId(bean.getId());
		roleDao.delete(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response getById(String id) {
		RoleModel model = new RoleModel();
		model.setId(id);
		model = roleDao.getModelById(model);
		RoleBean bean = new RoleBean(model.getId(), model.getDescription());
		return Response.ok().entity(bean).build();
	}
}

