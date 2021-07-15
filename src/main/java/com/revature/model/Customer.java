package com.revature.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
	
	
	private String firstName;
	private String lastName;
	private String contact;
	private Account account;
	
	private static Logger log = LoggerFactory.getLogger(Customer.class);
	public Customer( String firstName, String lastName, String contact, Account account) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.account = account;
	}


	public Customer() {
		super();
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	
}
