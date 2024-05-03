package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Item;

@Component
public class ItemDAOImpl implements ItemDAO {

	@Autowired
	 SessionFactory sessionFactory;
	 
	 
     ItemDAOImpl(){
    	 
     }
	public String add(Item item) {
		// TODO Auto-generated method stub
	 
	Session session=sessionFactory.openSession();
	session.getTransaction().begin();
	session.save(item);
	session.getTransaction().commit();
		return "item saved successfully";
	}
	public List<Item> getAllItems() {
		Session session=sessionFactory.openSession();
		// TODO Auto-generated method stub
		return session.createQuery("select i from Item i").getResultList();
	}

	public Item getItem(int id) {
		Session session=sessionFactory.openSession();
		// TODO Auto-generated method stub
		return session.find(Item.class, id);
	}

	public String updateItem(int id, Item item) {

		Session session=sessionFactory.openSession();
		Item i=session.find(Item.class, id);
		i.setItemName(item.getItemName());
		i.setItemOrder(i.getItemOrder());
		i.setPrice(item.getPrice());
		i.setQuantity(item.getQuantity());
		session.getTransaction().begin();
		session.save(i);
		session.getTransaction().commit();
			return "item saved successfully";// TODO Auto-generated method stub
	
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
