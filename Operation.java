package com.Bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    ArrayList<ContactDetails> contactDetails = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    ContactDetails con = new ContactDetails();

    public void addDetails() {

        Scanner scanner = new Scanner(System.in);
        ContactDetails details = new ContactDetails();
        System.out.println("Enter the First Name ");
        details.setFirstName(scanner.nextLine());
        System.out.println("Enter the Last Name ");
        details.setLastName(scanner.nextLine());
        System.out.println("Enter the Address ");
        details.setAddress(scanner.nextLine());
        System.out.println("Enter the City ");
        details.setCity(scanner.nextLine());
        System.out.println("Enter the State ");
        details.setState(scanner.nextLine());
        System.out.println("Enter the Zip Code ");
        details.setZip(scanner.nextLine());
        System.out.println("Enter the Phone Number ");
        details.setPhoneNumber(scanner.nextLine());
     
        contactDetails.add(details);
    }
    public void display() {

        System.out.println(contactDetails);
    }

   /* public static void main(String[] args) {

        boolean check = false;
        System.out.println("Welcome to Address Book Management System");
        Operation details = new Operation();

      /*  do {
            System.out.println("1.Add details.\n2.Display Contacts.");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    details.addDetails();
                    break;
                case 2:
                    details.display();
                    break;
                default:
                    System.out.println("Wrong option");
                    details.display();
                    break;
            }
        }
        while (!check);
    }
    */
    
   
}
    }
