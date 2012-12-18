package com.hotnews.authentication.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


public class ClusterAwareUsernamePasswordAuthentication extends UsernamePasswordAuthenticationFilter {
	private static final Logger logger = Logger.getLogger(ClusterAwareUsernamePasswordAuthentication.class);

	@Autowired private ClusterAwareSessionRegistryImpl sessionRegistry;
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request,
			HttpServletResponse response, Authentication authResult)
			throws IOException, ServletException {
		
		super.successfulAuthentication(request, response, authResult);
	}
}