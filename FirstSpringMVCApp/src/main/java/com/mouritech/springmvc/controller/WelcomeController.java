package com.mouritech.springmvc.controller;


import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mouritech.springmvc.model.Greetings;
import com.mouritech.springmvc.model.Welcome;

@Controller
@RequestMapping("/welcomecontroller")
public class WelcomeController {

	@RequestMapping("/welcome1")
	public String GreetingsHandler(Model model) {
		Welcome welcome = new Welcome();
		
		welcome.setMessage("Hello..Welcome!");
		return "welcome";

		
	}
}
