package com.mouritech.sellermanagementsystemwithrestcontroller.service;



import java.util.List;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;




//sellerid,sellername,selleremail,sellermobno,sellercity,sellercategory


public interface SellerService {

	List<Seller> getAllSellers();

	void saveSeller(Seller theNewSeller);

	Seller getSeller(Long sellid) throws SellerNotFoundException;

	void updateSeller(Long sellid, Seller theNewSeller);

	void updateSellerName(Long sellid, String sellname);
	
	void updateSellerEmail(Long sellid, String sellemail);
	
	void updateSellerMobno(Long sellid, Long sellmobno);
	
	void updateSellerCity(Long sellid, String sellcity);
	
	void updateSellerCategory(Long sellid, String sellcategory);
	

	

	void deleteSeller(Long sellid);

	

}