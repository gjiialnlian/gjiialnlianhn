package com.hotnews.authentication.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.web.authentication.logout.LogoutHandler;

public class ClusterAwareLogoutHandler implements LogoutHandler {

	private static final Logger logger = Logger.getLogger(ClusterAwareLogoutHandler.class);
	
	@Autowired
	private SessionRegistry sessionRegistry;

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication auth) {
		logger.info("ClusterAwareLogoutHandler.onLogoutSuccess");
		if (request.getSession() != null){
			String sessionId = request.getSession().getId();
			logger.info("Request session Id: " + sessionId);
			if(sessionRegistry instanceof ClusterAwareSessionRegistryImpl)
			{
				((ClusterAwareSessionRegistryImpl) sessionRegistry).expireNow(sessionId);
				logger.info("expireNow() " + sessionId);
			}else{ //this shouldn't happen since we are expecting a ClusterAwareSessionRegistryImpl to use this class.
				getSessionRegistry().removeSessionInformation(sessionId);
			}
		}		
	}

	public SessionRegistry getSessionRegistry() {
		return sessionRegistry;
	}

	public void setSessionRegistry(SessionRegistry sessionRegistry) {
		this.sessionRegistry = sessionRegistry;
	}
}