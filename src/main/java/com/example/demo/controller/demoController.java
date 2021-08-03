package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class demoController {
	
	@RequestMapping("/")
	public String root(){
		return "Hello World! this is root page";
	}
}
