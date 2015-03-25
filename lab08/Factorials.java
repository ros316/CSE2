//  Rachel Sholder
//  CSE 02
//  Lab 08

//  import scanner
import java.util.Scanner;

//  declare class
public class Factorials {

//  declare main method
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        int number = myScanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += factorial(i);
        }
        print(sum);
  } // end main method

//  declare method
    public static int factorial(int key){
        int mul = 1;
        for (int i = 1; i <= key; i++){
            mul *= i;
        }
        System.out.println(mul);
        return mul;
    } // end method

//  declare method
    public static void print(int num){
        System.out.println("The super factorial is equal to "+ num+"");
    } // end method
    
} // end class


