package com.dao;
import com.model.Item;
import java.util.*;
public interface ItemDAO {
	
	public String add(Item item);
	public List<Item> getAllItems();
	public Item getItem(int id);
	public String updateItem(int id,Item item);
	public String delete(int id);

}
