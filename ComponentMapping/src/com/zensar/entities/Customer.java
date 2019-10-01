package com.zensar.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Garvita Jain
 * @creation_date 25th September 2:53PM
 * @modification_date 26th September 2:53PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description Persistence Class
 * 
 */
@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Column(name = "Id")
	private int CustomerId;
	private Name CustomerName;
	private String Gender;
	private int age;
	@Column(nullable = false)
	private String address;
	private LocalDate BirthDate;

	private Blob ProfilePhoto;

	private Clob description;
	

	public Clob getDescription() {
		return description;
	}

	public void setDescription(Clob description) {
		this.description = description;
	}

	public Blob getProfilePhoto() {
		return ProfilePhoto;
	}

	public void setProfilePhoto(Blob profilePhoto) {
		ProfilePhoto = profilePhoto;
	}

	public LocalDate getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer() {
		// TODO Auto-generated constructor stub

	}

	public Customer(int customerId, Name customerName, String gender, int age, String address) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		Gender = gender;
		this.age = age;
		this.address = address;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public Name getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(Name customerName) {
		CustomerName = customerName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", Gender=" + Gender + ", age="
				+ age + "]";
	}

}
