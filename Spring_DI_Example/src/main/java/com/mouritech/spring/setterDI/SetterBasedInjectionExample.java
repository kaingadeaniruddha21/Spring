package com.mouritech.spring.setterDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.spring.service.MessageService;



@Component
public class SetterBasedInjectionExample {
	
	private MessageService msgService;

	public MessageService getMsgService() {
		return msgService;
	}

	@Autowired
	//@Qualifier("WhatsAppService")
	@Qualifier("PhoneService")
	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}
	
	public void sendMsg(String message) {
		msgService.sendMsg(message);
	}
	

}