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

import com.cogent.boot.entity.Celebration;
import com.cogent.boot.service.CelebrationBusinessLogic;
@RestController
@RequestMapping("api/celebration")
public class CelebrationController {
	@Autowired
	CelebrationBusinessLogic cbl;
	
	
	@GetMapping("/getCelebration")
	private List<Celebration> getAllCelebration(){
		
		
		return cbl.findAllCelebrations();
	}
	@PostMapping("/addCelebration")
	Celebration newCelebration(@RequestBody Celebration Celebration) {
		return cbl.add(Celebration);
		
	}
	@DeleteMapping("/deleteCelebration/{id}")
	String delete(@PathVariable("id") int id){
		cbl.delete(id);
		
		return "";
		
		
	}
	

	
	
	
}
