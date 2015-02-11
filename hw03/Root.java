//  Rachel Sholder
//  CSE 02
//  HW 3

import java.util.Scanner;

//  define a class
public class Root {
    
    //  define main method
    public static void main (String [] args) {
    
    //  declare
        Scanner myScanner;
    
    //  construct
        myScanner=new Scanner (System.in);
    
    //  guesses    
        System.out.print("Enter a double, and I print its cube root-");
        double x = myScanner.nextDouble();
        double guess = x/3;
        
    //  improving estimate

        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
    
    //  print guesses
    
        System.out.println("The cube root is " + guess + ": " +
            guess + "*" + guess + "*"+ guess + "=" + guess*guess*guess);
        
        
    }   // end main method
}   // end class
