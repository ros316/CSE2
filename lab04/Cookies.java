//  Rachel Sholder
//  CSE 02
//  Lab 04 - Cookies

//  user is responsible for bringing cookies to event

import java.util.Scanner;

//  define a class
public class Cookies {

//  define main method
    public static void main (String [] args) {

//  declare
    Scanner myScanner;
    
//  construct
    myScanner=new Scanner (System.in);
    
    // enter the number of people
    
    System.out.println("Enter the number of people: ");
    if(!myScanner.hasNextInt()) {
        System.out.println("You did not enter an int!");
        return;     // leaves the program, program terminates
    }
    int nPeople = myScanner.nextInt();
    
    if (nPeople <= 0) {
        System.out.println("You did not enter an integer greater than 0!");
        return;
    }
    
    // enter the number of cookies
    
    System.out.println("Enter the number of cookies you are planning to buy: ");
    int nCookies = myScanner.nextInt();
    
    // enter how many per person
    
    System.out.println("How many do you want each person to get: ");
    int cookiePerPerson = myScanner.nextInt();
    
    int minCookies = nPeople * cookiePerPerson;
    
    // what will happen if not enough cookies
    
    if (minCookies > nCookies) {
        System.out.println("You will not have enough cookies. You need to buy at least " + (minCookies - nCookies) + " more.");
        return;
    }

    // what will happen if they aren't divdied evenly
    
    if (nCookies % nPeople != 0) {
        System.out.println("You have enough, but they will not divide evenly.");
        return;
    }
    
    // what will happen if all is good
    
    System.out.println("You have enough cookies for each person and the amount will divide evenly.");
    
       
    }   // end main method
}   // end class