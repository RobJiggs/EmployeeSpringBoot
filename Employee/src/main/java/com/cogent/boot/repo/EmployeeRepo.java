/**
 * 
 */
package com.cogent.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cogent.boot.entity.Employee;


/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@Transactional
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	@Query(value = "SELECT u FROM Employee u ORDER BY empname")
	public List<Employee> findAllSortedByName();
	
	@Query(value="SELECT * FROM emp_tbl where empname=:empname",nativeQuery=true)
	public Employee findEmployeeNamed(@Param("empname")String empname);
	
	@Modifying 
	@Query(value="DELETE FROM emp_tbl where empname=:empname",nativeQuery=true)
	public void DeleteEmployeeNamed(@Param("empname")String empname);
	
	
	
	
}
