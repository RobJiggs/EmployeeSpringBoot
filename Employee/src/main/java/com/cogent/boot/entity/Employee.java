/**
 * 
 */
package com.cogent.boot.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;




/**
 * @author Robert Joasilus
 *
 * @date: Oct 19, 2022
 */
@Entity
@Table(name="Emp_tbl")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int empID;
	@NotBlank(message="Name cannot be blank")
	private String empname;
	@Size(min=2, max=15,message="Your Department Length is either too small or too big")
	private String empDept;
	private double salary;
	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	/**
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}
	/**
	 * @param empname the empname to set
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return empDept;
	}
	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @param empID
	 * @param empname
	 * @param empDept
	 * @param salary
	 */
	public Employee(int empID, String empname, String empDept, double salary) {
		super();
		this.empID = empID;
		this.empname = empname;
		this.empDept = empDept;
		this.salary = salary;
	}
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "empID=" + empID + ", empname=" + empname + ", empDept=" + empDept + ", salary=" + salary
				+ "";
	}
	
	
	
	

}
