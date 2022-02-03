package com.mouritech.spring.fieldbasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.spring.service.MessageService;



@Component
public class FieldBasedInjection {
	@Autowired
	@Qualifier("FacebookService")
	private MessageService msgService;

	public MessageService getMsgService() {
		return msgService;
	}

	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}
	
	public void sendMsg(String message) {
		msgService.sendMsg(message);
	}
	
}