package com.mouritech.sellermanagementsystemwithrestcontroller.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;



@Repository("orderRepository")
public interface SellerRepository extends JpaRepository<Seller, Long> {

}