package com.sujatha.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController {
	
	/*@RequestMapping("/home")
	public ModelAndView getHomePage() {
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("home");
		mv.addObject("hello", "Hi. I am a rest microservice");
		return mv;
	}
*/

	@RequestMapping("/home")
	public String getMain(){
		return "Hello. I am the first microservice in your webapp";
	}
}
