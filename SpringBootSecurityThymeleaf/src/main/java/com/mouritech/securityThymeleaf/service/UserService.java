package com.mouritech.securityThymeleaf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mouritech.securityThymeleaf.controller.dto.UserRegistrationDto;
import com.mouritech.securityThymeleaf.entity.User;



public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

}