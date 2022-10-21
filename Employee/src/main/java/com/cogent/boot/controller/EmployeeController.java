/**
 * 
 */
package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Employee;

import com.cogent.boot.repo.EmployeeRepo;


/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepo employeeRepo;

	@GetMapping("/getemployee")
	private List<Employee> getAllEmployee(){
		
		
		return employeeRepo.findAll();
	}
	@PostMapping("/addemployee")
	Employee newEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
		
	}
	@DeleteMapping("/deleteemployee/{id}")
	String delete(@PathVariable("id") int id){
		employeeRepo.deleteById(id);
		
		return "Deletion of" + " "+ "employee "+ " " + id + " " + "success";
		
		
		
	}
	@GetMapping("/tester")
	public String testString() {
		
		String name="Robert";
		return name;
		
	}
	@GetMapping("/testInt")
	public int testInt() {
		
		int name=2;
		return name;
		
	}
	
	
}
