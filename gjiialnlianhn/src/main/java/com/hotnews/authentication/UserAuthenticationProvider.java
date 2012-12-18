package com.hotnews.authentication;


import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserAuthenticationProvider implements UserDetailsService {

	private static final Logger logger = Logger.getLogger(UserAuthenticationProvider.class);

	private Map<String, UserDetails> userMap = new HashMap<String, UserDetails>();

	public UserAuthenticationProvider() {
		super();
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException, DataAccessException {
		
		UserDetailsImpl userDetails = new UserDetailsImpl();
		try {
			User user = new User();
			user.setUsername("mkyong");
			user.setPassword("123456");
			user.setAccountNonLocked(true);
			user.setEnabled(true);
			
			if (user != null) {
				userDetails = new UserDetailsImpl(user);
				userDetails.setAuthorities(AuthorityUtils.createAuthorityList("ROLE_USER"));
				userDetails.setEnabled(true);
				
				userDetails.setAccountNonLocked(true);
				userDetails.setAccountNonExpired(true);
				userDetails.setCredentialsNonExpired(true);
				
				userMap.put("mkyong", userDetails);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

		return userDetails;
	}

}