package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.Services;

@RestController
@RequestMapping("/emp")	//http:/localhost:9999/emp/
public class Controller {
	
	@Autowired
	Services service;
	
	@PostMapping("/addemp")	//http:/localhost:9999/emp/addemp
	public String insertEmployee(@RequestBody Employee emp) {
			
		return service.addEmployee(emp);
	}
	

}
