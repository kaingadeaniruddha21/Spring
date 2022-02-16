package com.mouritech.springbootsecuritywithroles_practice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.springbootsecuritywithroles_practice.entity.Staff;


@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

}