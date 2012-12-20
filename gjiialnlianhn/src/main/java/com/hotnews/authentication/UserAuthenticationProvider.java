package com.hotnews.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.hotnews.bean.LoginBean;
import com.hotnews.constant.CharacterEnum;
import com.hotnews.service.login.LoginService;

@Service("userDetailsService")
public class UserAuthenticationProvider implements UserDetailsService {

	@Autowired
	private LoginService loginService;
	
	public UserAuthenticationProvider() {
		super();
	}

	//new Md5PasswordEncoder().encodePassword(bean.getPassword(), null)
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		LoginBean bean = loginService.getById(username);
		if(bean != null)
			return new UserDetailsImpl(bean.getName(), bean.getRoleId(), bean.getPassword(), CharacterEnum.YES.getString().equalsIgnoreCase(bean.getActive()));
		else
			return new UserDetailsImpl();
	}
}