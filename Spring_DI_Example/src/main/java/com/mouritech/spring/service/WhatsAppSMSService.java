package com.mouritech.spring.service;

import org.springframework.stereotype.Service;

@Service("WhatsAppService")
public class WhatsAppSMSService implements MessageService {

		
	public void sendMsg(String msg) {
			
			System.out.println(msg + "......sent message using WhatsaAppSMSService");
		}

}
