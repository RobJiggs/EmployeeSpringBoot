/**
 * 
 */
package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Payroll;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 20, 2022
 */
@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Integer> {

}
