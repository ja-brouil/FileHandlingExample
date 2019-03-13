package com.main;

import java.util.ArrayList;

public class AddressBook {

	// Array List to hold all the contacts
	private ArrayList<Contact> addressBook;
	
	public AddressBook() {
		addressBook = new ArrayList<>();
	}
	
	// Add person
	public void addPerson(Contact contact) {
		addressBook.add(contact);
	}
	
	// you don't need a method to get the iterator unless your professor asks for it. It's built into the ArrayList. See the main method as an example.
	public void printAllNames() {
		
		// This is called the enhanced loop.
		// Grab every single contact object in the loop and call the toString() method on it
		for (Contact contact : addressBook) {
			System.out.println(contact.toString());
		}
		
		/*
		// If you prefer a traditional loop
		for (int i = 0; i < addressBook.size(); i++) {
			System.out.println(addressBook.get(i).toString());
		}
		*/
	}
	
	// Get Address Book
	public ArrayList<Contact> getAddressBook(){
		return addressBook;
	}
}
