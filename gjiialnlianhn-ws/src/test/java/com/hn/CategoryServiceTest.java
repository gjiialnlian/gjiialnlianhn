package com.hn;

import org.junit.Test;

import com.hn.bean.CategoryBean;

public class CategoryServiceTest extends GenericServiceTest<CategoryBean>{
	
	private static String service = "category";
	
	public CategoryServiceTest() {
		super(service, new CategoryBean("TEST_ID","TEST_NAME","TEST_DESCRIPTION","0"));
	}
	
	@Override
	@Test
	public void testAdd() throws Exception {
		this.setBean(new CategoryBean("SONGS","Songs","Songs","1"));
		super.testAdd();
	}
	
	//New
	//Showbiz
	//Sports
	//Scandals
	//Anime
	//Health
	//Movies
	//Songs
}
