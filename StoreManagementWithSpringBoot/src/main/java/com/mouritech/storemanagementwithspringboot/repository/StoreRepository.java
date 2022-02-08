package com.mouritech.storemanagementwithspringboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.mouritech.storemanagementwithspringboot.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
	Optional<Store> findByStoreId(String storeId);
	List<Store> findByStoreCountry(String storeCountry);
}
