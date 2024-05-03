package com.model;
import java.util.List;
import javax.persistence.*;
@Entity
public class Store {
	
	@Id
	@GeneratedValue
	private int storeId;
	private String storeName;
	private String location;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="itemId")
	List<Item> itemList;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="orderId")
	List<ItemOrder> orderList;
	
	
	public Store()
	{ 
		
	}

	public Store(String storeName, String location, List<Item> itemList) {
		super();
		this.storeName = storeName;
		this.location = location;
		this.itemList = itemList;
	}

	
	
	public List<ItemOrder> getOrderList() {
		return orderList;
	}
	

	public void setOrderList(List<ItemOrder> orderList) {
		this.orderList = orderList;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", location=" + location + ", itemList="
				+ itemList + "]";
	}
	
	
	

}
