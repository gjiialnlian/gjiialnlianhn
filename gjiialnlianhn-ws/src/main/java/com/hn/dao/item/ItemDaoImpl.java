package com.hn.dao.item;

import java.util.List;
import com.hn.constant.CategoryTable;
import com.hn.dao.GenericDaoImpl;
import com.hn.util.IDGeneratorUtil;

public class ItemDaoImpl extends GenericDaoImpl<ItemModel> implements ItemDao {
	
	public ItemDaoImpl() {
		super(new ItemModel());
	}
	
	@Override
	public List<ItemModel> getAll() {
		return super.getAll();
	}
	
	@Override
	public void insert(ItemModel model) {
		model.setId(IDGeneratorUtil.generateID(CategoryTable.find(model.getCatId()).getPrefix(), ""));
		super.insert(model);
	}
	
	@Override
	public void update(ItemModel model) {
		super.update(model);
	}
	
	@Override
	public void delete(ItemModel model) {
		super.delete(model);
	}
	
	@Override
	public ItemModel getModelById(ItemModel model) {
		return super.getModelById(model);
	}
	
}
