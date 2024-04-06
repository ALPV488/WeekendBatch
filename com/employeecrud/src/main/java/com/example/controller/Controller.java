package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/updateemp")//http:/localhost:9999/emp/updateemp
	public String updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	
	@DeleteMapping("/deleteemp/{eid}")//http:/localhost:9999/emp/deleteemp/id
	public String deleteEmployee(@PathVariable("eid") int empId) {
		return service.deleteEmployee(empId);
	}
	
	@GetMapping("/getemp/{eid}")//http:/localhost:9999/emp/getemp/id
	public Employee getEmployee(@PathVariable("eid") int empId) {
		return service.getEmployee(empId);
	}

}
