//  Rachel Sholder
//  CSE 02
//  HW 3
//  Bicycle Java Program

import java.util.Scanner ;

//  define a class
public class Bicycle {
    
//  main method required for every Java program
    public static void main (String [] args) {
  
//  declare     
    Scanner myScanner;
 
//  construct   
    myScanner = new Scanner (System.in);
    
    System.out.println("Enter the number of seconds during which the counts occurred as "+" a double (in the form of xx.xx: ");
    double nSeconds = myScanner.nextDouble();
    
    System.out.println("Enter the number of counts on a cyclometer (an integer > 0): ");
    int nCounts = myScanner.nextInt();
    
    //  intermediate variables and output data
    double wheelDiameter=27.0;   //  diameter of the wheel
    double PI=3.14159;   //  math pi
    double feetPerMile=5280; // feet per mile
    double inchesPerFoot=12; // inches per foot
    double secondsPerMinute=60; // seconds per minute
    double minutesPerSecond=60; // minutes per second
    double distance, mph, nMinutes; // declare variables
    
    //  run calculations    
    distance=(nCounts*wheelDiameter*PI);
    distance/=(inchesPerFoot*feetPerMile);
    nMinutes=(nSeconds/secondsPerMinute);
    mph=(distance/(nMinutes/60));;
    
    //  truncating decimals
    
    distance=distance*100;
    distance=(int) distance;
    distance=distance/100;
    
    nMinutes=nMinutes*100;
    nMinutes=(int) nMinutes;
    nMinutes=nMinutes/100;
    
    mph=mph*100;
    mph=(int) mph;
    mph=mph/100;
    
    //  print
    
    System.out.println("The distance was "+distance+" miles and took "+nMinutes+" minutes.");
    System.out.println("The average mph was "+mph+".");
    
    }   // end main
}   // end class