package com.hotnews.authentication.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.stereotype.Component;

@Component("sessionAuthenticationStrategy")
public class ClusterAwareSessionAuthenticationStrategy implements SessionAuthenticationStrategy {

	@Override
	public void onAuthentication(Authentication arg0, HttpServletRequest arg1,
			HttpServletResponse arg2) throws SessionAuthenticationException {
	
		System.out.println("test");
		
	}
}
