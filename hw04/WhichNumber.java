//  Rachel Sholder
//  CSE 02
//  HW 04

//  this program will guess the number between 1 and 10

import java.util.Scanner;


//  add comments here

//  define class
public class WhichNumber {

    //  define main method
    public static void main (String [] args) {
    
    Scanner myScanner;
    
    myScanner=new Scanner (System.in);
    
    int number=0;
    
    System.out.println("Think of a number between 1 and 10 inclusive.");
    
    System.out.print("Is the number even? ");
    
    String input = myScanner.next();
    
    if (input.equalsIgnoreCase("Y")) {
        System.out.print("Is it divisilbe by 3? ");
        input = myScanner.next();
        if (input.equalsIgnoreCase("Y")) {
            number = 6;
        } else if (input.equalsIgnoreCase("N")) {
            System.out.print("Is the number divislbe by 4? ");
            input = myScanner.next();
            if (input.equalsIgnoreCase("Y")) {
               System.out.print("Is the number divided by 4 greater than 1? ");
               input = myScanner.next();
               if (input.equalsIgnoreCase("Y")) {
                   number = 8;
               } else if (input.equalsIgnoreCase("N")) {
                   number = 4;
               }
            } else if (input.equalsIgnoreCase("N")) {
                System.out.print("Is the number divisible by 5? ");
                input = myScanner.next();
                if (input.equalsIgnoreCase("Y")) {
                    number = 10;
                } else if (input.equalsIgnoreCase("N")) {
                    number = 2;
                }
            }
        }
    } else if (input.equalsIgnoreCase("N")) {
        System.out.print("Is it divisible by 3? ");
        input = myScanner.next();
        if (input.equalsIgnoreCase("Y")) {
            System.out.print("When divided by 3 is the result greater than 1? ");
            input = myScanner.next();
            if (input.equalsIgnoreCase("Y")) {
                number = 9;
            } else if (input.equalsIgnoreCase("N")) {
                number = 3;
            }
        } else if (input.equalsIgnoreCase("N")) {
            System.out.print("Is it greater than 6? ");
            input=myScanner.next();
            if (input.equalsIgnoreCase("Y")) {
                number = 7;
            } else if (input.equalsIgnoreCase("N")) {
                System.out.print("Is it less than 3? ");
                input=myScanner.next();
                if (input.equalsIgnoreCase("Y")) {
                    number = 1;
                } else if (input.equalsIgnoreCase("N")) {
                    number = 5;
                }
            }
        }
    }
    
    if (number == 0) {
        System.out.println("Sorry, that is not a valid input.");
    } else {
        System.out.print("Is your number " + number + "? ");
        input = myScanner.next();
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("Yay!");
        } else {
            System.out.println("Noooo!");
        }
    }
    
        
    }   // end main method
}   // end class

