package com.mouritech.spring.service;

import org.springframework.stereotype.Service;

@Service("FacebookService")
public class FacebookSMSService implements MessageService {

	public void sendMsg(String msg) {
		
		System.out.println(msg + "......sent message using FacebookSMSService");
	}
}
