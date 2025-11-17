package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World!";
	}
	
	@RequestMapping("/lana")
	public @ResponseBody String greetingLana() {
		return "Hello, Lana!";
	}
	
	@RequestMapping("/new")
	public @ResponseBody String newPage() {
		return "Hello, Welcome to this new page!";
	}
	@RequestMapping("/copy")
	public @ResponseBody String copy() {
		return "Hello, this is the change in the copy page";
	}
	
	@RequestMapping("/original")
	public @ResponseBody String original() {
		return "Hello, This is the change I made in the original project!";
	}
	

}
