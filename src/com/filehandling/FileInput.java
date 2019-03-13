package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.main.AddressBook;
import com.main.Contact;

public class FileInput {
	
	// Address Book
	private AddressBook addressBook;
	
	// you don't need the scanner in here. Simply pass the string location and it should be good enough
	public FileInput(AddressBook addressBook) {
		this.addressBook = addressBook;
	}
	
	// Adds addresses
	// Throws FileNotFoundException -> If the file cannot be found, then the program will stop.
	public void addAddresses(String location) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File(location));

		// Keep reading the file while there is stuff to read
		while (scanner.hasNextLine()) {
			String data[] = scanner.nextLine().split(" "); // Grab the line, and seperate the string by spaces. Put these spaces into a String array
			
			// we know that the text follows the following pattern -> FirstName LastName PhoneNumber
			addressBook.addPerson(new Contact(data[0], data[1], data[2]));
		}
		
		// We are done using the scanner, close it
		scanner.close();
	}
	
	/**
	 * I know your professor said to read on FileReader and BufferedReader but the scanner can read files as well. Use whatever you prefer. The scanner is the easiest to deal with.
	 */
}
