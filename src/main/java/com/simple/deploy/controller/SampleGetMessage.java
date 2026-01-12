package com.simple.deploy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleGetMessage {
	
	@GetMapping
	public String greet(){
		return "successfully deployed end-to-end";
	}

}
