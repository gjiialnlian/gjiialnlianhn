package com.hotnews.dwr;

import java.util.List;

import org.directwebremoting.annotations.Param;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotnews.bean.UserBean;
import com.hotnews.service.user.UserService;

@Service(value = "UserDWR")
@RemoteProxy(
		name = "UserDWR",
		creator = SpringCreator.class,
		creatorParams = @Param(name = "beanName", value = "UserDWR")
)
public class UserDWR{
	
	@Autowired
	private UserService userService;

	@RemoteMethod
	public List<UserBean> getAll() {
		return userService.getAll();
	}

	@RemoteMethod
	public UserBean getById(String id) {
		return userService.getById(id);
	}

}
