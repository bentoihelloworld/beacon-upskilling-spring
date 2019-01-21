package com.beacon.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BeaconController {

	@RequestMapping("/")
	public String getIndexPage() {
		return "index";
	}

	@RequestMapping("/welcome")
	public ModelAndView getWelcomePage() {
		String message = "<h1>Welcome to Spring MVC!!!</h1>";
		String message2 = "<h1>Welcome to Spring MVC 2!!!</h1>";

		ModelAndView mv = new ModelAndView();
		mv.addObject("message1", message);
		mv.addObject("message2", message2);
		mv.setViewName("welcome");

		return mv;
	}

	@RequestMapping("/greetings")
	public String getGreetingsPage(Model model) {
		model.addAttribute("greetings", "Hello Again");

		return "greetings";
	}

}
