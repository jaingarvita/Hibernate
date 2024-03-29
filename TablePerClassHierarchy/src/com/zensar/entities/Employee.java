package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Garvita Jain
 * @creation_date 27th September 11:25PM
 * @modification_date 27th September 11:25PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description Persistence class
 * 
 */

@Entity
@Table(name = "emp_master")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "emp_type", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("A")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private LocalDate joiningDate;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, LocalDate joiningDate, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.joiningDate = joiningDate;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
