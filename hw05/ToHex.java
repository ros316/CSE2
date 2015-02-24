//  Rachel Sholder
//  CSE 02
//  HW 05

//  this program asks users to input 3 RGB values and convert them to hexadecimal values

import java.util.Scanner;

public class ToHex {
    public static void main (String [] args) {
    
        // declare and construct scanner  
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        System.out.print("Please enter three numbers from 0-255 reprsenting RGB values: ");
        
        //if the first number is an interger, then ask for second numnber
        if(myScanner.hasNextInt()){
            int red=myScanner.nextInt(); //call first number red
            if (myScanner.hasNextInt()){ //if the second number is an integer, ask for the third number
                int green=myScanner.nextInt(); //call second number green
                if(myScanner.hasNextInt()){ //if the third number is an integer
                    int blue=myScanner.nextInt(); //call third number blue
                    
                    // numbers in incorrect range
                    if(red < 0 || red > 255 || green < 0 || green > 255  || blue < 0 || blue > 255) { 
                        System.out.println("Sorry, you must enter values between 0-255."); 
                        return;
                    }
                        
                    // numbers in correct range
                    else {
                        String output = "";
                        // hexadecimal value of red computed 
                        int hexRed1= (red/16); 
                        int hexRed2=(red%16);
                        int hexGreen1 = green/16;
                        int hexGreen2 = green%16;
                        int hexBlue1 = blue/16;
                        int hexBlue2 = blue%16;
                        // hexadecimal same value as remainder
                        if (hexRed1 < 10) {
                            output += hexRed1;
                        // hexadecimal value is a letter
                        } else {
                            switch (hexRed1) {
                                case 10:
                                    output += "A"; break;
                                case 11:
                                    output += "B"; break;
                                case 12:
                                    output += "C"; break;
                                case 13:
                                    output += "D"; break;
                                case 14:
                                    output += "E"; break;
                                case 15:
                                    output += "F"; break;
                            }
                        }
                        // hexadecimal same value as remainder
                        if (hexRed2 < 10) {
                            output += hexRed2;
                        // hexadecimal value is a letter
                        } else {
                            switch (hexRed2) {
                                case 10:
                                    output += "A"; break;
                                case 11:
                                    output += "B"; break;
                                case 12:
                                    output += "C"; break;
                                case 13:
                                    output += "D"; break;
                                case 14:
                                    output += "E"; break;
                                case 15:
                                    output += "F"; break;
                            }
                        }
                        // hexadecimal value of green computed 
                        // hexadecimal same value as remainder
                        if (hexGreen1 < 10) {
                            output += hexGreen1;
                        // hexadecimal value is a letter
                        } else {
                            switch (hexGreen1) {
                                case 10:
                                    output += "A"; break;
                                case 11:
                                    output += "B"; break;
                                case 12:
                                    output += "C"; break;
                                case 13:
                                    output += "D"; break;
                                case 14:
                                    output += "E"; break;
                                case 15:
                                    output += "F"; break;
                            }
                        }
                        // hexadecimal same value as remainder
                        if (hexGreen2 < 10) {
                            output += hexGreen2;
                        // hexadecimal value is a letter
                        } else {
                            switch (hexGreen2) {
                                case 10:
                                    output += "A"; break;
                                case 11:
                                    output += "B"; break;
                                case 12:
                                    output += "C"; break;
                                case 13:
                                    output += "D"; break;
                                case 14:
                                    output += "E"; break;
                                case 15:
                                    output += "F"; break;
                            }
                        }
                        // hexadecimal value of blue computed 
                        // hexadecimal same value as remainder
                        if (hexBlue1 < 10) {
                            output += hexBlue1;
                        // hexadecimal value is a letter
                        } else {
                            switch (hexBlue1) {
                                case 10:
                                    output += "A"; break;
                                case 11:
                                    output += "B"; break;
                                case 12:
                                    output += "C"; break;
                                case 13:
                                    output += "D"; break;
                                case 14:
                                    output += "E"; break;
                                case 15:
                                    output += "F"; break;
                            }
                        }
                        // hexadecimal same value as remainder
                        if (hexBlue2 < 10) {
                            output += hexBlue2;
                        // hexadecimal value is a letter
                        } else {
                            switch (hexBlue2) {
                                case 10:
                                    output += "A"; break;
                                case 11:
                                    output += "B"; break;
                                case 12:
                                    output += "C"; break;
                                case 13:
                                    output += "D"; break;
                                case 14:
                                    output += "E"; break;
                                case 15:
                                    output += "F"; break;
                            }
                        }
                        
                        //  print the hexadecimals
                        System.out.println("The decimal numbers R:"
                                + red +", G:" + green + ", B:" + blue
                                + ", is represented in hexadecimal as: "
                                + output);
                        return;
                    }
                }
            }
        }
        
        System.out.println("Sorry, your input must consist of integers.");
    } // end main method
} // end class