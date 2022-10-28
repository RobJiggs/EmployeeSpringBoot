/**
 * 
 */
package com.cogent.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Employee;

import com.cogent.boot.repo.EmployeeRepo;
import com.cogent.boot.service.EmployeeBusinessLogic;


/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeBusinessLogic ebl;
	
	
	@Autowired
	EmployeeRepo employeeRepo;

	@GetMapping("/getemployee")
	private List<Employee> getAllEmployee(){
		
		
		return ebl.all();
	}
	@PostMapping("/addemployee")
	Employee newEmployee(@Valid @RequestBody Employee employee) {
		return ebl.add(employee);
		
	}
	@DeleteMapping("/deleteemployee/{id}")
	String delete(@PathVariable("id") int id){
		ebl.deleteById(id);
		
		return "Deletion of" + " "+ "employee "+ " " + id + " " + "success";
		
		
		
	}
	
	@DeleteMapping("/deleteemployee/name/{empname}")
	String delete(@PathVariable("empname") String empname){
		employeeRepo.DeleteEmployeeNamed(empname);
		
		return "Deletion of" + " "+ empname+ " " +  "success";
		
		
		
	}
	@GetMapping("/getemployee/ordered")
	private List<Employee> getAllEmployeeOrdered(){
		
		
		return employeeRepo.findAllSortedByName();
	}

	
	@GetMapping("/getemployee/ordered2")
	private List<Employee> getAllEmployeeOrdered2(){
		return ebl.perfromSorting();
		
		
		//return employeeRepo.findAllSortedByName();
	}
	
	@GetMapping("/getemployee/{empname}")
	private Employee findEmployeeNamed(@PathVariable ("empname") String empname){
		
		
		return employeeRepo.findEmployeeNamed(empname);
	}
	
	@PutMapping("/updateemployee")
	Employee updateEmployee(@RequestBody Employee employee)
	{   
		return employeeRepo.save(employee);
		
		
	}
	
    @PutMapping("/updateemployee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id,@RequestBody Employee employeeDetails) {
        Employee updateEmployee = employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not exist with id: " + id));

       // updateEmployee.setId(employeeDetails.getId());//chk
        updateEmployee.setEmpname(employeeDetails.getEmpname());
        updateEmployee.setSalary(employeeDetails.getSalary());
        updateEmployee.setEmpDept(employeeDetails.getEmpDept());

        employeeRepo.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
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
