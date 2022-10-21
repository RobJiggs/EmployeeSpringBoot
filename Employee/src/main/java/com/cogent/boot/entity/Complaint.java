/**
 * 
 */
package com.cogent.boot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 19, 2022
 */
@Entity
@Table(name="Complaint_tbl")
public class Complaint {
	@Id
	private int id;
	private String name;
	private String description;
	private String status;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	public Complaint() {
		super();
	}
	
	
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param status
	 */
	public Complaint(int id, String name, String description, String status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Complaint [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + "]";
	}
	
	
	

}
