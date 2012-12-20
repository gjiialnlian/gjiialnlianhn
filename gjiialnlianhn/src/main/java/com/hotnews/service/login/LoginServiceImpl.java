package com.hotnews.service.login;

import org.springframework.stereotype.Service;
import com.hotnews.bean.LoginBean;
import com.hotnews.service.GenericServiceImpl;

@Service("loginService")
public class LoginServiceImpl extends GenericServiceImpl<LoginBean> implements LoginService{

	public LoginServiceImpl() {
		super(new LoginBean());
	}

	@Override
	public Integer add(LoginBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer edit(LoginBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(LoginBean bean) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public LoginBean getById(String id) {
		return super.getById(id);
	}
}
