package com.hn;

import org.junit.Test;

import com.hn.bean.ItemBean;

public class ItemServiceTest extends GenericServiceTest<ItemBean>{
	
	private static String service = "item";
	
	public ItemServiceTest() {
		super(service, new ItemBean("sdsd","SONGS", "TEST_DESCR", "TEST_URL", "0"));
	}
	
	@Test
	public void testAdd() throws Exception {
		this.setBean(new ItemBean("uii87ui","SONGS", "TEST_DESCR", "TEST_URL", "0"));
		super.testAdd();
	}
	
}
