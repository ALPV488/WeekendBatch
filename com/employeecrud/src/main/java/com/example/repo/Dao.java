package com.example.repo;

import com.example.entity.Employee;

public interface Dao {
	
	public String addEmployee(Employee emp);
	
	public String updateEmployee(Employee emp);
	
	public String deleteEmployee(int empId);
	
	public Employee getEmployee(int empId);

}
