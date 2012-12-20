package com.hn;

import org.junit.Test;

import com.hn.bean.RoleBean;

public class RoleServiceTest extends GenericServiceTest<RoleBean>{
	
	private static String service = "role";
	
	public RoleServiceTest() {
		super(service, new RoleBean("TEST_ROLE_ID","TEST_ROLE"));
	}
	
	@Test
	public void testAdd() throws Exception {
		this.setBean(new RoleBean("TEST_ROLE","TEST_ROLE"));
		super.testAdd();
	}
}
