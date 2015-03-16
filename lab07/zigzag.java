//  Rachel Sholder
//  CSE 02
//  Lab 06

//  import scanner

import java.util.Scanner; 

//  define a class
public class zigzag {

//  define main method
    public static void main(String[] args){ 
       
    //  1
       
       //   for loop to create line of 10 stars
       for (int l=1; l<=10;l++){ 
        System.out.print("*"); 
       }
       System.out.println(); 
       
       
    //  2
    
        int nStars=10; //initialize number of stars
        for (int i=1; i<=10;i++){ //outer loop to control the inner loop
            for(int j=0; j<i; j++){ //inner loop that prints the number of spaces
                System.out.print(" "); //prints spaces on each line as long as the inner loop counter is less than the outer loop counter
                }
                System.out.print("*\n"); //prints one star on each line following the space(s)
            }
        System.out.println(); //starts new line
        
    //  3
    
        nStars=-1; 
        System.out.println("Enter an int between 3 and 33"); 
        
        Scanner myScanner;
        myScanner=new Scanner(System.in); 
        
         boolean runLoop=true; 
          
          while(runLoop){ //  
            while(!myScanner.hasNextInt()) { 
            System.out.println("Enter an int between 3 and 33:"); 
            myScanner.next(); 
            }
     
              
            nStars = myScanner.nextInt(); 
            while(nStars<=3 || nStars>=33){ 
            System.out.println("The number is out of range [3,33]"); 
            nStars=myScanner.nextInt(); //clears command line
            }
          
          
          int zigLength=nStars-2;
          String firstRow=""; 
          for(int counter=0; counter<nStars; counter++){ 
            System.out.print("*"); 
          }
        System.out.println(); 
        
        for (int i=1; i<=zigLength;i++){ 
            for(int counter=0; counter<i; counter++){
            System.out.print(" "); 
                }
                System.out.print("*\n"); 
        }
          for(int counter=0; counter<nStars; counter++){ 
            System.out.print("*"); 
          } 
        System.out.println(); 

        //  loop to control running again
          System.out.println("Enter y or Y to go again:"); 
            String runAgain=myScanner.next(); 
            if (runAgain.equals("y") || runAgain.equals("Y")){ 
               System.out.println("Enter an int between 3 and 33:"); 
               
            }
            else{ //if user said no, 
                break; //exit loop
            }
          } 
          
    } // end main method
} // end class