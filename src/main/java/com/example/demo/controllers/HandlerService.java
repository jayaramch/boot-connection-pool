package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandlerService {

	@Autowired
	private com.example.demo.service.HandlerService handlerService;
	
	@RequestMapping("/getById")
	public String getById() {
		handlerService.getById("1");
		return "";
	}
}
