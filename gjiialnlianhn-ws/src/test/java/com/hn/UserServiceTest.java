package com.hn;

import org.junit.Test;
import com.hn.bean.UserBean;

public class UserServiceTest extends GenericServiceTest<UserBean>{
	
	private static String service = "user";
	
	public UserServiceTest() {
		super(service, new UserBean("TEST_ID","TEST_NAME","TEST_EMAIL"));
	}
	
	@Test
	public void testAdd() throws Exception {
		this.setBean(new UserBean("TESTUSER","TEST_NAME","TEST_EMAIL"));
		super.testAdd();
	}
}
