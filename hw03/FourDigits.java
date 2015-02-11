//  Rachel Sholder
//  CSE 02
//  HW 03

import java.util.Scanner;

//  define a class
public class FourDigits {
    
    //  define main method
    public static void main (String [] args) {
    
        //  declare
        Scanner myScanner;
    
        //  construct
        myScanner=new Scanner (System.in);
        
        System.out.print("Enter a double and display the four digits to the right of the decimal point- ");
        double x = myScanner.nextDouble();
        
        //  casting to an int twice
        x = x - ((int) x);
        x=x*10000;
        int digits = (int) x;
        
        //  displaying four digits
        System.out.print("The four digits are ");
        System.out.print(digits/1000);
        System.out.print((digits/100)%10);
        System.out.print((digits/10)%10);
        System.out.print(digits%10);
        System.out.println();
        
        
    }   // end main
}   // end class