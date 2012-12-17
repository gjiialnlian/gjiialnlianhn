package com.hn.dao.role;

import java.util.List;

import com.hn.dao.GenericDaoImpl;

public class RoleDaoImpl extends GenericDaoImpl<RoleModel> implements RoleDao {
	
	public RoleDaoImpl() {
		super(new RoleModel());
	}
	
	@Override
	public List<RoleModel> getAll() {
		return super.getAll();
	}
	
	@Override
	public void insert(RoleModel model) {
		super.insert(model);
	}
	
	@Override
	public void update(RoleModel model) {
		super.update(model);
	}
	
	@Override
	public void delete(RoleModel model) {
		super.delete(model);
	}
	
	@Override
	public RoleModel getModelById(RoleModel model) {
		return super.getModelById(model);
	}
	
}
