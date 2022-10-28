package com.cogent.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Celebration {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int CelebrationID;
	private String Name;
	private double Budget;
	private int AmountGoing;
	public int getCelebrationID() {
		return CelebrationID;
	}
	public void setCelebrationID(int celebrationID) {
		CelebrationID = celebrationID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBudget() {
		return Budget;
	}
	public void setBudget(double budget) {
		Budget = budget;
	}
	public int getAmountGoing() {
		return AmountGoing;
	}
	public void setAmountGoing(int amountGoing) {
		AmountGoing = amountGoing;
	}
	public Celebration(int celebrationID, String name, double budget, int amountGoing) {
		super();
		CelebrationID = celebrationID;
		Name = name;
		Budget = budget;
		AmountGoing = amountGoing;
	}
	public Celebration() {
		super();
	}
	@Override
	public String toString() {
		return "Celebration [CelebrationID=" + CelebrationID + ", Name=" + Name + ", Budget=" + Budget
				+ ", AmountGoing=" + AmountGoing + "]";
	}
	
	
	
	
	
	
}
