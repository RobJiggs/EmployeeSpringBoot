/**
 * 
 */
package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Complaint;


/**
 * @author Robert Joasilus
 *
 * @date: Oct 19, 2022
 */
@Repository
public interface ComplaintRepo extends JpaRepository<Complaint,Integer> {

}
