package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.log4j.Logger;


@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		static Logger log = Logger.getLogger(App.class.getName());
		log.fatal("This is a fatal message for log4j");
		log.error("This is an error message for log4j");
		log.debug("This is an debug message for log4j");
		log.warn("This is a warning message for log4j");
		log.info("This is an info message for log4j");
		return "greeting";
	}

}
