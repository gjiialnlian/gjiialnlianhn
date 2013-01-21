package com.hn.service.item;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import com.hn.bean.ItemBean;
import com.hn.constant.CharacterEnum;
import com.hn.constant.ResponseStatus;
import com.hn.dao.item.ItemDao;
import com.hn.dao.item.ItemModel;

public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public Response getAll() {
		List<ItemModel> list = itemDao.getAll();
		List<ItemBean> beanList = new ArrayList<ItemBean>();
		
		for(ItemModel model : list){
			beanList.add(new ItemBean(model.getId(),model.getCatId(), model.getDescription(), model.getUrl(), model.getActive() == 1?CharacterEnum.YES.getString():CharacterEnum.NO.getString()));
		}
		
		return Response.ok().entity(beanList).build();
	}

	@Override
	public Response add(ItemBean bean) {		
		ItemModel model = new ItemModel();
		model.setId(bean.getId());
		model.setCatId(bean.getCatId());
		model.setDescription(bean.getDescription());
		model.setUrl(bean.getUrl());
		model.setActive(bean.getActive().equals(CharacterEnum.YES.getString())?1:0);
		model.setDescription(bean.getDescription());
		model.setActive(bean.getActive().equals(CharacterEnum.YES.getString())?1:0);
		itemDao.insert(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response edit(ItemBean bean) {
		ItemModel model = new ItemModel();
		model.setId(bean.getId());
		model.setCatId(bean.getCatId());
		model.setDescription(bean.getDescription());
		model.setUrl(bean.getUrl());
		model.setActive(bean.getActive().equals(CharacterEnum.YES.getString())?1:0);
		model.setDescription(bean.getDescription());
		model.setActive(bean.getActive().equals(CharacterEnum.YES.getString())?1:0);
		itemDao.update(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response delete(ItemBean bean) {
		ItemModel model = new ItemModel();
		model.setId(bean.getId());
		itemDao.delete(model);
		bean.setStatus(ResponseStatus.PASSED);
		return Response.ok().entity(bean).build();
	}

	@Override
	public Response getById(String id) {
		ItemModel model = new ItemModel();
		model.setId(id);
		model = itemDao.getModelById(model);
		ItemBean bean = new ItemBean(model.getId(),model.getCatId(), model.getDescription(), model.getUrl(), model.getActive() == 1?CharacterEnum.YES.getString():CharacterEnum.NO.getString());
		return Response.ok().entity(bean).build();
	}
}

