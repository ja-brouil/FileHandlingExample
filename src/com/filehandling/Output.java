package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.main.AddressBook;
import com.main.Contact;

public class Output {
	
	// Access to the address book
	private AddressBook addressBook;
	
	public Output(AddressBook addressBook) {
		this.addressBook = addressBook;
	}
	
	// We need to throw a IOException in case the folder we are trying to write to can't do that for some reason
	public void writeContacts(String outputFileLocation) throws IOException {
		
		// File writer allows us to write to a file
		FileWriter fileWriter = new FileWriter(new File(outputFileLocation));
		
		// Get all objects from the address book and write to it. | I am using the enhanced loop, see below if you prefer traditional loop
		for (Contact contact : addressBook.getAddressBook()) {
			fileWriter.write(contact.toString() +"\n"); // Grab the object text and write it. "\n" adds a new line
		}
		
		// File Writer Close -> always close your scanners/resources
		fileWriter.close();
		
		System.out.println("Writing of contacts is complete.");
	}
}
