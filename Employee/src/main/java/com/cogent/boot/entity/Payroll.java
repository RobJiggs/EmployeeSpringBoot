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
 * @date: Oct 20, 2022
 */
@Entity
@Table(name="Payroll_tbl")
public class Payroll {
	@Id
	private int id;
	private String name;
	private double amount;
	private double taxes;
	private int daysWorked;
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
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the taxes
	 */
	public double getTaxes() {
		return taxes;
	}
	/**
	 * @param taxes the taxes to set
	 */
	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}
	/**
	 * @return the daysWorked
	 */
	public int getDaysWorked() {
		return daysWorked;
	}
	/**
	 * @param daysWorked the daysWorked to set
	 */
	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", amount=" + amount + ", taxes=" + taxes + ", daysWorked="
				+ daysWorked + "]";
	}
	/**
	 * @param id
	 * @param name
	 * @param amount
	 * @param taxes
	 * @param daysWorked
	 */
	public Payroll(int id, String name, double amount, double taxes, int daysWorked) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.taxes = taxes;
		this.daysWorked = daysWorked;
	}
	/**
	 * 
	 */
	public Payroll() {
		super();
	}
	
	
	
	

}
