package com.hn;

import org.junit.Test;
import com.hn.bean.LoginBean;
import com.hn.constant.CharacterEnum;

public class LoginServiceTest extends GenericServiceTest<LoginBean>{
	
	private static String service = "login";
	
	public LoginServiceTest() {
		super(service, new LoginBean("TESTUSER_LOGIN","TESTUSER","TEST_ROLE","PASSWORD",CharacterEnum.YES.getString()));
	}
	
	@Test
	public void testAdd() throws Exception {
		this.setBean(new LoginBean("GIAN_CARLO","TESTUSER","TEST_ROLE","e10adc3949ba59abbe56e057f20f883e",CharacterEnum.YES.getString()));
		super.testAdd();
	}
}
