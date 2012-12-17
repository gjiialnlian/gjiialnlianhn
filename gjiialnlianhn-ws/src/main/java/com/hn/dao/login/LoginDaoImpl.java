package com.hn.dao.login;

import java.util.List;

import com.hn.dao.GenericDaoImpl;

public class LoginDaoImpl extends GenericDaoImpl<LoginModel> implements LoginDao {
	
	public LoginDaoImpl() {
		super(new LoginModel());
	}
	
	@Override
	public List<LoginModel> getAll() {
		return super.getAll();
	}
	
	@Override
	public void insert(LoginModel model) {
		super.insert(model);
	}
	
	@Override
	public void update(LoginModel model) {
		super.update(model);
	}
	
	@Override
	public void delete(LoginModel model) {
		super.delete(model);
	}
	
	@Override
	public LoginModel getModelById(LoginModel model) {
		return super.getModelById(model);
	}
	
}
