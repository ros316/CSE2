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
    
    System.out.println("Enter the number of people (an integer > 0): ");
    int nPeople = myScanner.nextInt();
    
    if(myScanner.hasNextInt());
    else{
        System.out.println("You did not enter an int");
        return;     // leaves the program, program terminates
        
    }
    
    System.out.println("Enter the number of cookies you are planning to buy (an integer > 0): ");
    int nCookies = myScanner.nextInt();
    
    System.out.println("How many do you want each person to get? (an integer > 0): ");
       
    }   // end main method
}   // end class