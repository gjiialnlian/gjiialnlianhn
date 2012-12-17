package com.hn;

import com.hn.bean.LoginBean;

public class LoginServiceTest extends GenericServiceTest<LoginBean>{
	
	private static String service = "login";
	
	public LoginServiceTest() {
		super(service, new LoginBean("TESTUSER_LOGIN","TESTUSER","PASSWORD"));
	}
}
