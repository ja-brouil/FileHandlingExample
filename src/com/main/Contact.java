package com.main;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String phoneNumber; // I usually would use an integer here but for simplicity's sake, it's easier to deal with Strings
	
	public Contact(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "First name: " + firstName + " Last name: " + lastName + " Phone Number: " + phoneNumber;
	}
	
}
