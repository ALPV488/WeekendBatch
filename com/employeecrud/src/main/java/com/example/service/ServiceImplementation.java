package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repo.Dao;

@Service
public class ServiceImplementation implements Services{
	
	@Autowired
	Dao dao;
	
	@Override
	public String addEmployee(Employee emp) {
	
		return dao.addEmployee(emp);
	}

}
