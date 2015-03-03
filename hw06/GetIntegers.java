//  Rachel Sholder
//  CSE2
//  HW6

//  5 non negative integers and the sum of those integers

//  import scanner
import java.util.Scanner;

//  define a class
public class GetIntegers {
    
//  define  main method
    public static void main(String[] args){

        //declare and construct scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);    
        
        //declare and initialize the sum of the 5 numbers
        int sum=0;
        
            //  enter 5 integers
            System.out.println("Enter 5 non negative numbers:   ");
            
            //  create a loop that runs 5x
            for (int i = 1; i <= 5; i++) { 
                    if(myScanner.hasNextInt()){ 
                        int number=myScanner.nextInt(); 
                        if(number>=0){ 
                           sum=sum+number; 
                        }
                        //  if the input is negative
                        else { 
                             System.out.println("Invalid input, enter again");  
                             i=i-1; 
                        }

                    }
                    else { 
                        i=i-1; 
                        //  if the input is not an integer
                        System.out.println("Invalid input, enter again"); 
                        myScanner.next(); 
                                }
                        }
                        
        //  print the sum
        System.out.println("Sum is "+sum+""); 

    }  // end main method
}   // end class