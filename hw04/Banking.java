//  Rachel Sholder
//  CSE 02
//  HW 04

//  comments

import java.util.Scanner;
import java.lang.Math;

//  define class
public class Banking {
    
    //  define main method
    public static void main (String [] args) {

        //  declare and construct
        Scanner myScanner;
        myScanner=new Scanner (System.in); 
        
        double balance = (int)(Math.random() * 400000 + 100000);
        balance /= 100;
        
        System.out.print("Pick one of the following: 1- Deposit Money, 2 - Withdraw Money, 3- View Your Balance");
        
        int number = myScanner.nextInt();
        double amount;
        
        switch (number) {
            case 1:
                System.out.print("How much money would you like to deposit? ");
                amount = myScanner.nextDouble();
                if (amount < 0) {
                    System.out.println("You did not enter a positive number.");
                } else {
                    balance=balance+amount;
                    System.out.println("New balance: $"+balance+".");
                }
                break;
            case 2:
                System.out.print("How much money would you like to withdrawal? ");
                amount = myScanner.nextDouble();
                if (amount > balance) {
                    System.out.println("You cannot withdraw more money than you have.");
                } else {
                    balance=balance-amount;
                    System.out.println("New balance: $"+balance+".");
                }
                break;
            case 3:
                System.out.print("Your account balance is $"+balance+".");
                break;
        }
        
        
    }
}