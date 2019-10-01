package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 * @author Garvita Jain
 * @creation_date 25th September 2:46PM
 * @modification_date 26th September 2:46PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description Java Beans Class
 * 
 */
@Embeddable

public class Name {

	// TODO Auto-generated method stub
	@Column(name = "firstname", length = 30)

	private String firstName;
	private String middleName;
	private String lastName;

	public Name() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;

	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}

}
