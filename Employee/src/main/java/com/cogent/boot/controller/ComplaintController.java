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

import com.cogent.boot.entity.Complaint;
import com.cogent.boot.repo.ComplaintRepo;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 19, 2022
 */
@RestController
@RequestMapping("api/complaint")
public class ComplaintController {
	@Autowired
	ComplaintRepo complaintRepo;

	@GetMapping("/getcomplaint")
	private List<Complaint> getAllComplaint(){
		
		
		return complaintRepo.findAll();
	}
	@PostMapping("/addcomplaint")
	Complaint newComplaint(@RequestBody Complaint complaint) {
		return complaintRepo.save(complaint);
		
	}
	
	@DeleteMapping("/deletecomplaint/{id}")
	String delete(@PathVariable("id") int id){
		complaintRepo.deleteById(id);
		
		return "Deletion of" + " "+ "complaint "+ " " + id + " " + "success";
		
		
	}
	
	@GetMapping("/complaintTester")
	public Double testDouble() {
		
		Double rj=1.22;
		return rj;
		
	}
}
