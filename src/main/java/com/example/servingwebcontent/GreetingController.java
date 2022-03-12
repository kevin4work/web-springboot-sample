package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.log4j.Logger;


@Controller
public class GreetingController {
	final static Logger logger = Logger.getLogger(GreetingController.class);

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		
		logger.info("This is an info message for log4j");
		return "greeting";
	}

}
