package com.model;

import javax.persistence.*;

@Entity
public class Item {
	@Id
	@GeneratedValue
	private int itemId;
	private String itemName;
	private float price;
	private int quantity;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ItemOrder itemOrder;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Store store;
	
	   public Item() {}
   
	   
	   
	public Store getStore() {
		return store;
	}



	public void setStore(Store store) {
		this.store = store;
	}



	public ItemOrder getItemOrder() {
		return itemOrder;
	}



	public void setItemOrder(ItemOrder itemOrder) {
		this.itemOrder = itemOrder;
	}



	public Item(String itemName, float price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}



	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	   
	   

}
