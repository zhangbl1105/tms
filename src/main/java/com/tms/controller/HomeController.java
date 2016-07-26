package com.tms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}


    @RequestMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }
}
