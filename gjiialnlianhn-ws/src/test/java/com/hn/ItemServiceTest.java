package com.hn;

import com.hn.bean.ItemBean;

public class ItemServiceTest extends GenericServiceTest<ItemBean>{
	
	private static String service = "item";
	
	public ItemServiceTest() {
		super(service, new ItemBean("","NEWS", "TEST_DESCR", "TEST_URL", "0"));
	}
	
//	@Override
//	@Test
//	public void testAdd() throws Exception {
//		this.setBean(new ItemBean("SONGS","Songs","Songs","1"));
//		super.testAdd();
//	}
	
}
