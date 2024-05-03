package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.ItemDAO;
import com.dao.ItemOrderDAO;
import com.model.Item;
import com.model.ItemOrder;
import com.model.Store;

@Controller
public class StoreController {
	
	@Autowired
	ItemDAO itemDAO;
	
	@Autowired
	ItemOrderDAO itemOrderDAO;
	
	@RequestMapping("/")
	public String getIndex()
	{ 
	
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/saveitem")
	public String saveitem(Item item)
	{
		itemDAO.add(item);
		return "index";
	}
	
	@RequestMapping("/itemorder")
	public String getItemOrder()
	{ 
		 return "ItemOrder";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/itemorder")
	public String saveItemOrder(String orderdate,String item1,String item2,String item3,String storeName,String location)
	{ 
		
		   ItemOrder itemOrder=new ItemOrder();
		   itemOrder.setDateTime(orderdate);
		    Item item=new Item();
		    item.setItemName(item1);
		    item.setPrice(20);
		    item.setQuantity(10);
		 
		    Item tea=new Item();
		    tea.setItemName(item2);
		    tea.setPrice(30);
		    tea.setQuantity(15);
		    
		    
		    Item tea1=new Item();
		    tea1.setItemName(item3);
		    tea1.setPrice(35);
		    tea1.setQuantity(20);
		    
		    ArrayList<Item> itemList=new ArrayList();
		    itemList.add(item);
		    itemList.add(tea);
		    itemList.add(tea1);
		   itemOrder.setItemList(itemList);
		   Store store=new Store();
		   store.setStoreName(storeName);
		   store.setLocation(location);
		   itemOrder.setStore(store);
		
		 // System.out.println(orderdate+" "+item1+" "+item2+" "+item3+" "+storeName+" "+location);
		
		 
		   itemOrderDAO.addItemOrder(itemOrder);
		   
		   return "itemOrder";
	}
	
	

}
