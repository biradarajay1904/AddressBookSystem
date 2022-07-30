package com.Bridgelabz;


	import java.util.HashMap;
	import java.util.Scanner;

	public class AddressBook{
		
		Scanner sc = new Scanner(System.in);
		static HashMap<String, AddressBook> map=new HashMap<>();
		
		private int select() {
			int selection;
			do {
				System.out.println();
		 	    System.out.println("Enter 1. To Add the contacts");
		    	    System.out.println("Enter 2. To Print all contacts");
			    System.out.println("Enter 3. To Edit the contacts");
			    System.out.println("Enter 4. To Delete the contacts");
			    System.out.println("Enter 5. To Exit");
			    System.out.println("Enter your choice");
			    selection = sc.nextInt(); 
			}while(selection<1 || selection > 5);
				
			return selection;
		}
			
		public static void main(String[] args) {

			AddressBook addBook = new AddressBook(); 
			AddressBook addBookOne = new AddressBook(); 
			AddressBook addBookTwo = new AddressBook(); 
			AddressBook addBookThree = new AddressBook(); 
			
			Operation book = new Operation();
			
			int choice;
			System.out.println("Welcome to Address Book");
			System.out.println();
	          do {		
	        	choice = addBook.select();
			    switch(choice) {
			
			         case 1 :book.add();
			            break;
			         case 2 :book.printlist(book.contactlist);
			            break;
			         case 3 :book.edit();
			            break;
			         case 4: book.delete();
			            break;
			         case 5: System.out.println("End");
			  }
		   }while(choice != 5);
	        
	      }
			
		}		