package com.dao;
import com.model.Store;
import java.util.List;
public interface StoreDAO {

	   public String addStore(Store store);
	   public Store getStore(int id);
	   public List<Store> getAllStores();
	   public String updateStore(int id ,Store store);
	   public String deleteStore(int id);
}
