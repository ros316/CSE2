//  Rachel Sholder
//  CSE 02
//  HW 04

//  this program will guess the number between 1 and 10

import java.util.Scanner;


//  define class
public class WhichNumber {

    //  define main method
    public static void main (String [] args) {
    
    Scanner myScanner;
    
    myScanner=new Scanner (System.in);
    
    int number=0;
    
    System.out.println("Think of a number between 1 and 10 inclusive.");
    
    // prompts the user to answer yes or no
    System.out.print("Is the number even? ");
    
    // assigns the user input to variable
    String input = myScanner.next(); 
    
    // if the number is even
    if (input.equalsIgnoreCase("Y")) {
        System.out.print("Is it divisilbe by 3? ");
        input = myScanner.next();
        // if the number is divisible by 3
        if (input.equalsIgnoreCase("Y")) {
            number = 6;
        // if the number is not divisible by 3
        } else if (input.equalsIgnoreCase("N")) {
            System.out.print("Is the number divislbe by 4? ");
            input = myScanner.next();
            // if the number is divisible by 4
            if (input.equalsIgnoreCase("Y")) {
               System.out.print("Is the number divided by 4 greater than 1? ");
               input = myScanner.next();
               // if the number divided by 4 is greater than 1
               if (input.equalsIgnoreCase("Y")) {
                   number = 8;
                // if the number divided by 4 is not greater than 1
               } else if (input.equalsIgnoreCase("N")) {
                   number = 4;
               }
            // if the number is not divisible by 4
            } else if (input.equalsIgnoreCase("N")) {
                System.out.print("Is the number divisible by 5? ");
                input = myScanner.next();
                // if the number is divisible by 5
                if (input.equalsIgnoreCase("Y")) {
                    number = 10;
                // if the number is not divisible by 5
                } else if (input.equalsIgnoreCase("N")) {
                    number = 2;
                }
            }
        }
        
    // if the number is odd 
    } else if (input.equalsIgnoreCase("N")) {
        System.out.print("Is it divisible by 3? ");
        input = myScanner.next();
        // if the number is divisble by 3
        if (input.equalsIgnoreCase("Y")) {
            System.out.print("When divided by 3 is the result greater than 1? ");
            input = myScanner.next();
            // if the number is greater than 1 when divided by 3
            if (input.equalsIgnoreCase("Y")) {
                number = 9;
            // if the number is not greater than 1 when divided by 3
            } else if (input.equalsIgnoreCase("N")) {
                number = 3;
            }
        // if the number is not divisble by 3
        } else if (input.equalsIgnoreCase("N")) {
            System.out.print("Is it greater than 6? ");
            input=myScanner.next();
            // if the number is greater than 6
            if (input.equalsIgnoreCase("Y")) {
                number = 7;
            // if the number is not greater than 6
            } else if (input.equalsIgnoreCase("N")) {
                System.out.print("Is it less than 3? ");
                input=myScanner.next();
                // if the number is less than 3
                if (input.equalsIgnoreCase("Y")) {
                    number = 1;
                // if the number is not less than 3
                } else if (input.equalsIgnoreCase("N")) {
                    number = 5;
                }
            }
        }
    }
    
    if (number == 0) {
        // print invalid input
        System.out.println("Sorry, that is not a valid input.");
    } else {
        // ask if this is correct number
        System.out.print("Is your number " + number + "? ");
        input = myScanner.next();
        if (input.equalsIgnoreCase("Y")) {
            // correct number
            System.out.println("Yay!");
        } else {
            // incorrect number
            System.out.println("Noooo!");
        }
    }
    
        
    }   // end main method
}   // end class

