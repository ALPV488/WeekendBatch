package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DaoImplementation implements Dao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public String addEmployee(Employee emp) {
		
		em.persist(emp);//insert in db
		
		return "Your data is added successfully!!!";
	}

	@Override
	public String updateEmployee(Employee emp) {
		
		em.merge(emp);
		
		return "Your data is updated successfully";
	}

	@Override
	public String deleteEmployee(int empId) {
		
		Employee emp =	em.find(Employee.class,empId);
	
		em.remove(emp);
		
		return "Your data is deleted successfully";
	}

	@Override
	public Employee getEmployee(int empId) {
		
		return em.find(Employee.class,empId);
	}
	
	

}


