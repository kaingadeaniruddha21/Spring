package com.mouritech.sellermanagementsystemwithrestcontroller.controller;



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

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;
import com.mouritech.sellermanagementsystemwithrestcontroller.service.SellerService;



@RestController
@RequestMapping("/api/v1")
public class SellerController {
	
	@Autowired
	private SellerService sellService;
	
	@PostMapping("/seller") 
	public ResponseEntity<?> saveSeller(@RequestBody Seller theNewSeller) {
		sellService.saveSeller(theNewSeller);
		return ResponseEntity.ok().body("New seller added successfully");
	}
	
	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getAllSellers() {
		List<Seller> sellerList = sellService.getAllSellers();
		return ResponseEntity.ok().body(sellerList);
	}
	
	@PutMapping("/seller/{sid}")
	public ResponseEntity<?> updateSeller(@PathVariable("sid") Long sellid,@RequestBody Seller theNewSeller ) throws SellerNotFoundException {
		//Order existingOrder = null;
		 sellService.updateSeller(sellid,theNewSeller);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }

	@PutMapping("/seller/{sid}/{sname}")
	public ResponseEntity<?> updateSellerName(@PathVariable("sid") Long sellid,
			@PathVariable("sname") String sellname) throws SellerNotFoundException {
		//Order existingSeller = null;selldate
		 sellService.updateSellerName(sellid,sellname);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@PutMapping("/seller/{sid}/{semail}")
	public ResponseEntity<?> updateSellerEmail(@PathVariable("sid") Long sellid,
			@PathVariable("semail") String sellemail) throws SellerNotFoundException {
		//Order existingSeller = null;selldate
		 sellService.updateSellerEmail(sellid,sellemail);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	
	@PutMapping("/seller/{sid}/{smobno}")
	public ResponseEntity<?> updateSellerMobno(@PathVariable("sid") Long sellid,
			@PathVariable("smobno") Long sellmobno) throws SellerNotFoundException {
		//Order existingSeller = null;selldate
		 sellService.updateSellerMobno(sellid,sellmobno);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@PutMapping("/seller/{sid}/{scity}")
	public ResponseEntity<?> updateSellerCity(@PathVariable("sid") Long sellid,
			@PathVariable("scity") String sellcity) throws SellerNotFoundException {
		//Order existingSeller = null;selldate
		 sellService.updateSellerCity(sellid,sellcity);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@PutMapping("/seller/{sid}/{scategory}")
	public ResponseEntity<?> updateSellerCategory(@PathVariable("sid") Long sellid,
			@PathVariable("scategory") String sellcategory) throws SellerNotFoundException {
		//Order existingSeller = null;selldate
		 sellService.updateSellerCategory(sellid,sellcategory);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	

	
	
	
	
	
	
	@GetMapping("/seller/{sid}")
	public ResponseEntity<Seller> getSeller(@PathVariable("sid") Long sellid) throws SellerNotFoundException {
		Seller seller = sellService.getSeller(sellid);
		return ResponseEntity.ok().body(seller);
	}
	
	@DeleteMapping("/seller/{sid}")
	public ResponseEntity<?> deleteSeller(@PathVariable("sid") Long sellid) throws SellerNotFoundException {
		sellService.deleteSeller(sellid);
		return ResponseEntity.ok().body("Seller deleted successfully");
	}

}