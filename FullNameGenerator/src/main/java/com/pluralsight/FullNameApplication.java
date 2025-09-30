package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //What are our known variables


        //You will prompt the user to enter the parts of their name
        System.out.print("What is your First name:");
        String userFirstName = scanner.nextLine().trim();

        System.out.print("What is your Middle name:");
        String userMiddleName = scanner.nextLine().trim();

        System.out.print("What is your Last name:");
        String userLastName = scanner.nextLine().trim();

        System.out.print("Enter Suffix if applicable:");
        String userSuffixName = scanner.nextLine().trim();


        //What are the unknown values do I need from user?
        //new string that holds the user’s full name.
        String fullName = userFirstName + " " + userMiddleName + " " + userLastName + " " + userSuffixName;

        //Checking to see if They have a middle name or Suffix.
        //May need to use equalsIgnoreCase() and isEmpty()
        fullName = (userMiddleName.isEmpty()) ? userFirstName + " " + userLastName + " " + userSuffixName :  userFirstName + " " + userMiddleName + " " + userLastName + " "+ "," + userSuffixName;
        fullName = (userSuffixName.isEmpty()) ? userFirstName + " " + userMiddleName+ " " + userLastName + " "  :  userFirstName + " " + userMiddleName + " " + userLastName + " " + ","+ userSuffixName;



        //Display the result
        //first name , last name
        //first name , middle name , last name
        //first name , last name , suffix
        //first name , middle name , last name , suffix

        System.out.println("Full name: "+ fullName);
    }
}