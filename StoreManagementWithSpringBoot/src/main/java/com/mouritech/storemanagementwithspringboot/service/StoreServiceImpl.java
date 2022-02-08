package com.mouritech.storemanagementwithspringboot.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.storemanagementwithspringboot.entity.Store;
import com.mouritech.storemanagementwithspringboot.exception.StoreNotFoundException;
import com.mouritech.storemanagementwithspringboot.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreRepository storeRepository;
	
	@Override
	public Store insertStore(Store newStore) {
		newStore.setStoreId(generateStoreId());
		return storeRepository.save(newStore);
	}
	
	
	public String generateStoreId() {
		Random rand = new Random(); //instance of random class
	      int upperbound = 500;
	        //generate random values from 0-254
	      Long pId = (long) rand.nextInt(upperbound);
		return "STORE" + pId; 
	
	}

	@Override
	public List<Store> showAllStores() {
		// TODO Auto-generated method stub
		return storeRepository.findAll();
	}

	@Override
	public Store showStoreById(String storeId) throws StoreNotFoundException {
		return storeRepository.findByStoreId(storeId).orElseThrow(() -> new StoreNotFoundException("store not found with id " + storeId));
	}

	@Override
	public Store updateStoreById(String storeId, Store store) throws StoreNotFoundException {
		Store existingStore = storeRepository.findByStoreId(storeId).orElseThrow(() -> new StoreNotFoundException("store not found with id " + storeId));
		existingStore.setStoreAddress(store.getStoreAddress());
		existingStore.setStoreCity(store.getStoreCity());
		existingStore.setStoreConNo(store.getStoreConNo());
		existingStore.setStoreCountry(store.getStoreCity());
		existingStore.setStoreEmail(store.getStoreEmail());
		existingStore.setStoreStrtDate(store.getStoreStrtDate());
		storeRepository.save(existingStore);
		return existingStore;
	}

	@Override
	public void deleteStoreById(String storeId)throws StoreNotFoundException {
		Store existingStore = storeRepository.findByStoreId(storeId).orElseThrow(() -> new StoreNotFoundException("store not found with id " + storeId));
		storeRepository.delete(existingStore);
	}

	@Override
	public ResponseEntity<List<Store>> showStoreByCountry(String storeCountry) {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Store>>(storeRepository.findByStoreCountry(storeCountry), HttpStatus.OK);
	}

}
