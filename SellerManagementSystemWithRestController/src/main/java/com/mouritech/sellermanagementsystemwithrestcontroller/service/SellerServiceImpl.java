package com.mouritech.sellermanagementsystemwithrestcontroller.service;



import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;
import com.mouritech.sellermanagementsystemwithrestcontroller.repository.SellerRepository;



@Service
public class SellerServiceImpl implements SellerService{
	
	@Autowired
	private SellerRepository sellerRepository;

	@Transactional
	public List<Seller> getAllSellers() {
		
		return sellerRepository.findAll();
	}

	@Transactional
	public void saveSeller(Seller theNewSeller) {
		
		sellerRepository.save(theNewSeller);
	}

	@Transactional
	public Seller getSeller(Long sellid) throws SellerNotFoundException{
		return sellerRepository.findById(sellid)
				.orElseThrow(() -> new SellerNotFoundException(sellid));
	}
	
	@Transactional
	public void deleteSeller(Long sellid) {
		sellerRepository.deleteById(sellid);
		
	}
	
	
	

	@Override
	@Transactional
	public void updateSeller(Long sellid, Seller theNewSeller) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerName(theNewSeller.getSellerName());
			existingSeller.setSellerEmail(theNewSeller.getSellerEmail());
			existingSeller.setSellerMobno(theNewSeller.getSellerMobno());
			existingSeller.setSellerCity(theNewSeller.getSellerCity());
			existingSeller.setSellerCategory(theNewSeller.getSellerCategory());
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	@Override
	@Transactional
	public void updateSellerName(Long sellid, String sellname) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerName(sellname);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@Override
	@Transactional
	public void updateSellerEmail(Long sellid, String sellemail) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerEmail(sellemail);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	@Transactional
	public void updateSellerMobno(Long sellid, Long sellmobno) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerMobno(sellmobno);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	@Transactional
	public void updateSellerCity(Long sellid, String sellcity) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerCity(sellcity);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	@Transactional
	public void updateSellerCategory(Long sellid, String sellcategory) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerCategory(sellcategory);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

		

}