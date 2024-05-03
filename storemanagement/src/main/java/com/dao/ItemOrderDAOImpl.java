package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.ItemOrder;

@Component
public class ItemOrderDAOImpl implements ItemOrderDAO {
	
	
	@Autowired
	SessionFactory sessionFactory;

	public String addItemOrder(ItemOrder itemOrder) {
		// TODO Auto-generated method stub
	  Session session=sessionFactory.openSession();
	  session.getTransaction().begin();
	  
	  session.save(itemOrder);
	  session.getTransaction().commit();
		
		return "Saved Item Order";
	}

	public List<ItemOrder> getAllItemOrder() {
		
	
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createQuery("select itemorder from ItemOrder itemorder").getResultList();
	}

	public ItemOrder getItemOrder(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().find(ItemOrder.class,id);
	}

	public String updateItemOrder(int id, ItemOrder order) {
		
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		ItemOrder itemOrder1=getItemOrder(id);
		
		itemOrder1.setItemList(order.getItemList());
		itemOrder1.setItemList(order.getItemList());
		itemOrder1.setStore(order.getStore());
		session.save(itemOrder1);
		session.getTransaction().commit();
		// TODO Auto-generated method stub
		return "Item Order Updated";
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		
	Session session=sessionFactory.openSession();
	session.getTransaction().begin();
	session.delete(getItemOrder(id));
	session.getTransaction().commit();
		return "item order deleted for id "+id;
	}

}
