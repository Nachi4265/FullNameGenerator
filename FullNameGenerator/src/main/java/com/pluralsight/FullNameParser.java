package com.pluralsight;


import java.util.Scanner;

public class FullNameParser {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //Values to get from user
        String firstName;
        String middleName;
        String lastName;

        //Prompt user to enter their name.
        System.out.print("Please enter your name ");
        String FullName = scanner.nextLine().trim();


        String nameParse = FullName;
        String regex = "[ ]";
        String[] myArray = nameParse.split(regex);
        for (String nameSplitUp : myArray){
            System.out.println(nameSplitUp);
        }


        //Display the users name in 1 of 2 ways
        //First name  :
        //Middle name :
        //Last name   :

        //or

        //First name  :
        //Middle name : (none)
        //Last name   :

        //use if statement to select print style
    }







}
