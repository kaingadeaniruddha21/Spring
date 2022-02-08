package com.mouritech.storemanagementwithspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.storemanagementwithspringboot.entity.Store;
import com.mouritech.storemanagementwithspringboot.exception.StoreNotFoundException;
import com.mouritech.storemanagementwithspringboot.service.StoreService;


@RestController
@RequestMapping("store/api/v1")
public class StoreController {

	
	@Autowired
	StoreService storeService;
	
	@PostMapping("store")
	public Store insertStore(@RequestBody Store newStore) {
		
		return storeService.insertStore(newStore);
		
	}
	
	@GetMapping("store")
	public List<Store> showAllStores(){
		return storeService.showAllStores();
		
	}
	
	@GetMapping("store/{stid}")
	public Store showStoreById(@PathVariable("stid") String storeId) throws StoreNotFoundException{
		return storeService.showStoreById(storeId);
		
	}
	@GetMapping("storebycountry/{stcntry}")
	public ResponseEntity<List<Store>> showStoreByCountry(@PathVariable("stcntry") String storeCountry) throws StoreNotFoundException{
		return storeService.showStoreByCountry(storeCountry);
		
	}
	
	@PutMapping("store/{stid}")
	public Store updateProductById(@PathVariable("stid") String storedId,@RequestBody Store store) throws StoreNotFoundException{
		return storeService.updateStoreById(storedId,store);
		
	}
	
	@DeleteMapping("store/{stid}")
	public String deleteStoreById(@PathVariable("stid") String storedId) throws StoreNotFoundException{
		storeService.deleteStoreById(storedId);
		 return "deleted the store";
		
	}
	

	
	
}
