package com.hn;

import com.hn.bean.UserBean;

public class UserServiceTest extends GenericServiceTest<UserBean>{
	
	private static String service = "user";
	
	public UserServiceTest() {
		super(service, new UserBean("TEST_ID","TEST_ROLE","TEST_NAME","TEST_EMAIL","Y"));
	}
}
