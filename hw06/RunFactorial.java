//  Rachel Sholder
//  CSE2 
//  HW 6

//  generates factorial of input numbers

//  import the scanner
import java.util.Scanner;

//  define a class
public class RunFactorial {

//  define main method
    public static void main(String[] args){ 
        
        //declare scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in); 
        
        //  initialize variables
        long factorial=1; 
        System.out.println("Enter an int between 9 and 16: "); 
        int t=0;
        
        //  make sure input is a long
        while(!myScanner.hasNextLong()) { 
            // prompt error message if incorrect input
            System.out.println("Input accepted:"); 
            myScanner.next(); 
        }
        
        //  store input
        long number=myScanner.nextLong();
                int counter=1; 
                
                //  begin the loop
                 while (counter<=number){ 
                     
                    //  if valid input
                    if (number>=9 && number<=16) { 
                       factorial*=counter; 
                       ++counter; 
                    }
            
                    // if invalid input
                    else { 
                        System.out.println("Invalid input, enter again!"); 
                          
                        myScanner.next();
                        long number2=myScanner.nextLong(); 
                            if (number2>=9 && number2<=16){ 
                                while (counter<=number2){ 
                    
                                //  compute factorial
                                factorial*=counter; 
                                ++counter; 
                                 } 
                            }
                    }
                }
     
        //  print factorial
        System.out.println("Input accepted:");
        System.out.println(""+number+"!= "+factorial+""); 
          
    }   // end main method
}   // end class