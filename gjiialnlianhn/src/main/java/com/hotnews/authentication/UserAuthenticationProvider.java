package com.hotnews.authentication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hotnews.bean.UserBean;
import com.hotnews.service.user.UserService;

@Service("userDetailsService")
public class UserAuthenticationProvider implements UserDetailsService {

	@Autowired
	private UserService userService;
	
	public UserAuthenticationProvider() {
		super();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		
		UserDetailsImpl userDetails = new UserDetailsImpl();
		
		UserBean userBean = userService.getById(username);
		
		userBean.
		
//		user.setUsername("mkyong");
//		user.setPassword(new Md5PasswordEncoder().encodePassword("123456", null));
//		user.setAccountNonLocked(true);
//		user.setEnabled(true);
//			
//		if (user != null) {
//				userDetails = new UserDetailsImpl(user);
//				userDetails.setAuthorities(getAuthorities());
//				userDetails.setEnabled(true);
//				
//				userDetails.setAccountNonLocked(true);
//				userDetails.setAccountNonExpired(true);
//				userDetails.setCredentialsNonExpired(true);
//				
//				
//			}
return null;

		//return userDetails;
	}
	
	private Collection<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		List<String> permissions = new ArrayList<String>();
		permissions.add("ROLE_ADMIN");
		authorities = AuthorityUtils.createAuthorityList(permissions.toArray(new String[0]));					
		return authorities;
	}
	
//	public List<String> getUserNames() {
//		return new ArrayList<String>(userMap.keySet());
//	}

}