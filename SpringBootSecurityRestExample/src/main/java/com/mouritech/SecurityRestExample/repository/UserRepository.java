package com.mouritech.SecurityRestExample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.SecurityRestExample.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail2);



}