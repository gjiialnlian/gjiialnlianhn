package com.hn;

import com.hn.bean.RoleBean;

public class RoleServiceTest extends GenericServiceTest<RoleBean>{
	
	private static String service = "role";
	
	public RoleServiceTest() {
		super(service, new RoleBean("TEST_ROLE_ID","TEST_ROLE"));
	}
}
