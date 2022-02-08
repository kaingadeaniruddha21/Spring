package com.mouritech.storemanagementwithspringboot.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.storemanagementwithspringboot.entity.Store;
import com.mouritech.storemanagementwithspringboot.exception.StoreNotFoundException;

public interface StoreService {

	Store insertStore(Store newStore);

	List<Store> showAllStores();

	Store showStoreById(String storeId) throws StoreNotFoundException;

	Store updateStoreById(String storedId, Store store) throws StoreNotFoundException;

	void deleteStoreById(String storedId) throws StoreNotFoundException;

	ResponseEntity<List<Store>> showStoreByCountry(String storeCountry);

}
