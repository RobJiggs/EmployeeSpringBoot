package com.cogent.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.boot.entity.Employee;
import com.cogent.boot.repo.EmployeeRepo;
@Service
public class EmployeeBusinessLogic {
  @Autowired
  EmployeeRepo employeeRepo;
	public List<Employee> all(){
		return employeeRepo.findAll();
		
		
		
	}
	
	public Employee add(Employee employee) {
		return employeeRepo.save(employee);
		
	}
	
	public String deleteById(int id) {
		employeeRepo.deleteById(id);
		return "";
		
	}
	
	
	public List<Employee> perfromSorting() {
		return employeeRepo.findAllSortedByName();
	  
	  
	  
  }
	
	
	
}
