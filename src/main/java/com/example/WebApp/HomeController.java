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
	@RequestMapping("/change-in-copy")
	public @ResponseBody String copied() {
		return "Hello, These are the changes I made in the copied project!";
	}
	

}
