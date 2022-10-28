package com.cogent.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.boot.entity.Celebration;
import com.cogent.boot.repo.CelebrationRepo;
@Service
public class CelebrationBusinessLogic {
@Autowired
CelebrationRepo celebrationRepo;

public List<Celebration>findAllCelebrations(){
	return celebrationRepo.findAll();
	
	
}

public Celebration add(Celebration celebration){
	return celebrationRepo.save(celebration);
	
	
}
public String delete(int id) {
	celebrationRepo.deleteById(id);
	return "Deletion of" + " "+ "Celebration "+ " " + id + " " + "success";
	
	
}



	
}
