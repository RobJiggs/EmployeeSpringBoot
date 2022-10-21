/**
 * 
 */
package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Employee;


/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
