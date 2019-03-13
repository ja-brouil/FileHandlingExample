package com.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.filehandling.FileInput;
import com.filehandling.Output;

public class Main {
	
	public static String defaultLocation = "res/output.txt";

	public static void main(String[] args) {
		
		// Address Book
		AddressBook addressBook = new AddressBook();
		
		// Input, output
		FileInput fileInput = new FileInput(addressBook);
		Output fileOutput = new Output(addressBook);
		
		// Scanner to accept user data
		Scanner inputLocation = new Scanner(System.in);
		
		// Grab the information entered
		// If you want to test the file in here, type res/people.txt
		System.out.println("Enter the file location: ");
		String locationString = inputLocation.nextLine();
		
		// Need a try/catch block here in case the file can't be found
		// If the file can't be found, then it will throw an error.
		try {
			fileInput.addAddresses(locationString);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Test to print all names
		addressBook.printAllNames();
		
		// Write all the Names to a file now | change this default location to whatever you want
		// We need a try/catch block here in case we can't write to the directory to prevent the program from crashing completely
		try {
			fileOutput.writeContacts(defaultLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Close Scanner
		inputLocation.close();

	}
}
