package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Garvita Jain
 * @creation_date 27th September 11:47PM
 * @modification_date 27th September 2:18PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description Entity class
 * 
 */
@Entity
@Table(name="wageemp_1")
public class WageEmp extends Employee {
	private int hours;
	private float rate;

	public WageEmp() {
		// TODO Auto-generated constructor stub
	}

	public WageEmp(int empId, String name, LocalDate joiningDate, double salary, int hours, float rate) {
		super(empId, name, joiningDate, salary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}

}
