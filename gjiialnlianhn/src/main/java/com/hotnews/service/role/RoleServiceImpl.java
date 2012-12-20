package com.hotnews.service.role;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hotnews.bean.RoleBean;
import com.hotnews.service.GenericServiceImpl;

@Service("roleService")
public class RoleServiceImpl extends GenericServiceImpl<RoleBean> implements RoleService{

	public RoleServiceImpl() {
		super(new RoleBean());
	}
	
	@Override
	public Integer add(RoleBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer edit(RoleBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(RoleBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleBean> getAll() {
		return super.getAll();
	}
	
	@Override
	public RoleBean getById(String id) {
		return super.getById(id);
	}
}
