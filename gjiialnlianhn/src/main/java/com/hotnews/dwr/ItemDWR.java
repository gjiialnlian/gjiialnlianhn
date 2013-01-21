package com.hotnews.dwr;

import java.util.List;
import org.directwebremoting.annotations.Param;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotnews.bean.ItemBean;
import com.hotnews.service.item.ItemService;


@Service(value = "ItemDWR")
@RemoteProxy(
		name = "ItemDWR",
		creator = SpringCreator.class,
		creatorParams = @Param(name = "beanName", value = "ItemDWR")
)
public class ItemDWR{
	
	@Autowired
	private ItemService itemService;
	
	@RemoteMethod
	public List<ItemBean> getAll(){	
		return itemService.getAll();
	}
	
	@RemoteMethod
	public Integer add(String name, String catId, String url) {
		return itemService.add(new ItemBean("", catId, name, url, "1"));
	}
	
}
