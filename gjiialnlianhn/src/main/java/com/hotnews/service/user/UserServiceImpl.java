package com.hotnews.service.user;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hotnews.bean.UserBean;
import com.hotnews.service.GenericServiceImpl;

@Service("userService")
public class UserServiceImpl extends GenericServiceImpl<UserBean> implements UserService{

	public UserServiceImpl() {
		super(new UserBean());
	}
	
	@Override
	public Integer add(UserBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer edit(UserBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(UserBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserBean> getAll() {
		return super.getAll();
	}

	@Override
	public UserBean getById(String id) {
		return super.getById(id);
	}

}
