package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cogent.boot.EmployeeManagement;
import com.cogent.boot.controller.ComplaintController;
import com.cogent.boot.controller.EmployeeController;

@SpringBootTest(classes = EmployeeManagement.class)
class EmployeeApplicationTests {

	@Test
	void contextLoads() {
		
	}
	@Test
	void TestString(){
		EmployeeController emp=new EmployeeController();
		assertEquals("Robert",emp.testString());
		
		
		
	}
	@Test
	void TestInt(){
		EmployeeController emp=new EmployeeController();
		assertEquals(5,emp.testInt());
		
		
		
	}
	
	
	@Test
	void TestDouble() {
		ComplaintController compla = new ComplaintController();
		assertEquals(1.2211,compla.testDouble());
		
	}
	
	

}
