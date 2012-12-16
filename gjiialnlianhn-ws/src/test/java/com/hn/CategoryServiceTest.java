package com.hn;

import com.hn.bean.CategoryBean;

public class CategoryServiceTest extends GenericServiceTest<CategoryBean>{
	
	private static String service = "category";
	
	public CategoryServiceTest() {
		super(service, new CategoryBean("TEST_ID","TEST_NAME","TEST_DESCRIPTION","0"));
	}
}
