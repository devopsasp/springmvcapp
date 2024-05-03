package com.dao;

import com.model.ItemOrder;
import java.util.List;
public interface ItemOrderDAO {
	public String addItemOrder(ItemOrder itemOrder);
    public List<ItemOrder> getAllItemOrder();
    public ItemOrder getItemOrder(int id);
    public String updateItemOrder(int id,ItemOrder order);
    public String delete(int id);
}
