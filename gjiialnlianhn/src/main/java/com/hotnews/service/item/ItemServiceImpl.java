package com.hotnews.service.item;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hotnews.bean.ItemBean;
import com.hotnews.service.GenericServiceImpl;

@Service("itemService")
public class ItemServiceImpl extends GenericServiceImpl<ItemBean> implements ItemService{

	public ItemServiceImpl() {
		super(new ItemBean());
	}
	
	@Override
	public Integer add(ItemBean bean) {
		return super.add(bean);
	}

	@Override
	public Integer edit(ItemBean bean) {
		return null;
	}

	@Override
	public Integer delete(ItemBean bean) {
		return null;
	}

	@Override
	public List<ItemBean> getAll() {
		return super.getAll();
	}
	
	@Override
	public ItemBean getById(String id) {
		return super.getById(id);
	}

}
