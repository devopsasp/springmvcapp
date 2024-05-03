package com.model;
import java.util.List;
import javax.persistence.*;
@Entity
public class ItemOrder {
	
	@Id
	@GeneratedValue
	private int orderId;
	private String dateTime;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="itemId")
	private List<Item> itemList;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Store store;
	
	
	public ItemOrder()
	{ 
		 
	}
	

	public ItemOrder(String dateTime, List<Item> itemList) {
		super();
		this.dateTime = dateTime;
		this.itemList = itemList;
	}

	
	
	public Store getStore() {
		return store;
	}


	public void setStore(Store store) {
		this.store = store;
	}


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "ItemOrder [orderId=" + orderId + ", dateTime=" + dateTime + ", itemList=" + itemList + "]";
	}
	
	

}
