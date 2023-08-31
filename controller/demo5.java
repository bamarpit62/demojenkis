package com.demo.amdocsb5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class demo5 {
	
	@GetMapping("/get")
	public String show() {
		return "Welcome to amdocs spring boot session";
	}
	@GetMapping("/set")
	public String show1() {
		return "great all of us doing great";
	}

}