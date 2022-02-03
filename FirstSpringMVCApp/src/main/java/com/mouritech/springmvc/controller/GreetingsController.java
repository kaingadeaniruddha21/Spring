package com.mouritech.springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mouritech.springmvc.model.Greetings;

@Controller
@RequestMapping("/greetingscontroller")
public class GreetingsController {

	@RequestMapping("/saygreeting")
	public String GreetingsHandler(Model model) {
		Greetings greetings = new Greetings();
		greetings.setDateTime(LocalDateTime.now().toString());
		greetings.setMessage("good morning!");
		return "greetings";

		
	}
}
