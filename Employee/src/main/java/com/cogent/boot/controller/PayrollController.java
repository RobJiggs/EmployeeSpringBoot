/**
 * 
 */
package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Payroll;
import com.cogent.boot.repo.PayrollRepo;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 20, 2022
 */
@RestController
@RequestMapping("api/payroll")
public class PayrollController {
	@Autowired
	PayrollRepo payrollRepo;

	@GetMapping("/getpayroll")
	private List<Payroll> getAllPayroll(){
		
		
		return payrollRepo.findAll();
	}
	@PostMapping("/addpayroll")
	Payroll newPayroll(@RequestBody Payroll payroll) {
		return payrollRepo.save(payroll);
		
	}
	
	@DeleteMapping("/deletepayroll/{id}")
	String delete(@PathVariable("id") int id){
		payrollRepo.deleteById(id);
		
		return "Deletion of" + " "+ "payroll "+ " " + id + " " + "success";
		
		
	}
	

	}


