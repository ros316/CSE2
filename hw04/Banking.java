//  Rachel Sholder
//  CSE 02
//  HW 04 - Banking

//  This program uses switch statments to process transactions

import java.util.Scanner;
import java.lang.Math;

//  define class
public class Banking {
    
    //  define main method
    public static void main (String [] args) {

        //  declare and construct
        Scanner myScanner;
        myScanner=new Scanner (System.in); 
        
        //  declare balance
        double balance = (int)(Math.random() * 400000 + 100000);
        balance /= 100;
        
        //  pick 3 options
        System.out.print("Pick one of the following: 1- Deposit Money, 2 - Withdraw Money, 3- View Your Balance");
        
        //  declare variables
        int number = myScanner.nextInt();
        double amount;
        
        switch (number) {   // begin switch statement
            case 1: // if user chooses to deposit
                System.out.print("How much money would you like to deposit? ");
                amount = myScanner.nextDouble();
                if (amount < 0) {   // checks for a positive number
                    System.out.println("You did not enter a positive number.");
                } else {
                    balance=balance+amount; // store new balance
                    System.out.println("New balance: $"+balance+".");
                }
                break;  // end case 1
            case 2: // if user chooses to withdraw
                System.out.print("How much money would you like to withdrawal? ");
                amount = myScanner.nextDouble();
                if (amount > balance) { // checks to make sure you have enough money
                    System.out.println("You cannot withdraw more money than you have.");
                } else {
                    balance=balance-amount; // store new balance
                    System.out.println("New balance: $"+balance+".");
                }
                break;  // end case 2
            case 3: // if user chooses to see balance
                System.out.print("Your account balance is $"+balance+".");
                break;  // end case 3
        }
        
        
    }
}