package com.hn.dao.user;

import java.util.List;

import com.hn.dao.GenericDaoImpl;

public class UserDaoImpl extends GenericDaoImpl<UserModel> implements UserDao {
	
	public UserDaoImpl() {
		super(new UserModel());
	}
	
	@Override
	public List<UserModel> getAll() {
		return super.getAll();
	}
	
	@Override
	public void insert(UserModel model) {
		super.insert(model);
	}
	
	@Override
	public void update(UserModel model) {
		super.update(model);
	}
	
	@Override
	public void delete(UserModel model) {
		super.delete(model);
	}
	
	@Override
	public UserModel getModelById(UserModel model) {
		return super.getModelById(model);
	}
	
}
