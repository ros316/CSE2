//  Rachel Sholder
//  CSE 02
//  Lab 10

//  import scanner
import java.util.Scanner;

//  declare class
public class ArrayInputs {
    

    //  declare main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Please enter an integer for the size of an array: ");
        int sizeArray=myScanner.nextInt();
        int [] numbersArray=new int[sizeArray];
         
        System.out.print("Please enter " + sizeArray + " positive integer: ");
        for (int i=0; i<sizeArray; i++){
             numbersArray[i]=verifyValue();
        }
        
        System.out.println();
        System.out.println("The array is:");
        for (int j=0;j<sizeArray; j++){
          System.out.println(numbersArray[j]);   
        }
    
        } // end main method

        public static int verifyValue(){
            Scanner myScanner = new Scanner(System.in);
            while(!myScanner.hasNextInt()){
                System.out.print("Sorry, you didn’t enter an integer.");
                myScanner.next();
            }
            int number= myScanner.nextInt();
            while (number<0 ) {
                System.out.println("Sorry, the number you entered is negative.");
                number=myScanner.nextInt();
            }
      
            return number;
        } // end method
       
} // end class


