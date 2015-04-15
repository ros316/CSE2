//  Rachle Sholder
//  HW 11
//  Arrays: Searching (Binary and Linear)
//  This program asks the user to enter 15 final grades of CSE students

import java.util.Scanner; 
import java.util.Random;

//  define class
public class CSE2Linear{ 
    public static void main(String[] args) { //add main method
    
        Scanner myScanner;  // declare scanner
        myScanner = new Scanner(System.in); //  construct scanner
        System.out.println("Enter 15 ints for final grades in CSE2:  "); //prompt user
        int arraylength = 15; // array size
        int [] grades = new int[15]; // initalize array
        
        for (int i=0; i<grades.length; i++){ //begin loop to assign each array index to a grade
               while(!myScanner.hasNextInt()){ //prompt user to enter only integers
                   System.out.println("You did not enter an int. Try Again. ");
                    myScanner.hasNext();
               } // ends while loop
               int number=myScanner.nextInt();
               while (number<0 || number>100){ //prompt user to enter grades between 0 and 100
                   System.out.println("You did not enter an int between 0 and 100. Try Again. ");
                   number=myScanner.nextInt();
               } // end while loop
               grades[i]=number; 
           }    // ends for loop
          
        sort(grades); //calls sorting method 
        int [] sortedGrades=grades; //assign the sorted array to new variable
        System.out.println("Enter a grade to search for: "); //prompt user
        binarySearch(sortedGrades); //calls on binary search method
        scramble(sortedGrades); //calls on method that scrambles the sorted array
        int [] scrambleGrades=sortedGrades; //assigns the scrambled array to a new variable
         
        System.out.println("Enter a grade to search for: "); //prompt user 
        linearSearch(scrambleGrades); //calls on linear search method
        
    }   // end main method

    public static void sort(int [] array){ // sorting method
        for (int i=0; i<array.length-1; i++){  // start for loop
            for (int j=i+1; j<array.length; j++){ // start innermost for loop
                if (array[i]>array[j]){ // start if statement
                    int k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                } // end if statement
            } // end innermost for loop
        } // end for loop
        
        String print="The grades, sorted, are: "; //prints the sorted array
    	for(int a=0; a<array.length; a++){ // start for loop
        	if(a>0){ // start if statement
          	print+=" ";  // enter space between numbers
        	} // end if statement
        	print+=array[a];
      	} // end for loop
      	System.out.println(print); // print
    } // end method
    
    public static void scramble(int[] array){ // scrambling method
        Random randGenerator; // declare random generator
        randGenerator = new Random(); // construct random generator
        for (int i=0; i<array.length; i++){ // start for loop
            int j=randGenerator.nextInt(15); //generates a random integer 
            int k=array[i]; 
            array[i]=array[j]; 
            array[j]=k; 
        }   // end for loop
        String print="Scrambled: "; //the following code prints the scrambled array
      	for(int a=0; a<array.length; a++){  // start for loop
        	if(a>0){ // start if statement
          	print+=" "; // enter space between numbers
        	} // end if statement
        	print+=array[a];
      	}   // end for loop
      	System.out.println(print); // print
    }   // end method
    
    public static void binarySearch(int[] array){ // binary search method
        Scanner myScanner; // declare
        myScanner=new Scanner(System.in); // construct
        int userInput; // declare
        userInput=myScanner.nextInt(); // construct
        int sup=14, inf=0; //assigns the limits
        int center=(sup+inf)/2; //calculates middle point
        int counter=1; //counter to track iterations
        while ((array[center]!=userInput) && (inf<=sup)){ // start while loop
            if (array[center]>userInput){ // start if statement
                sup=center-1;
            }
            else{
                inf=center+1;
            } // end if else
            center=(sup+inf)/2; //the center member is dynamically changing for each iteration of the loop
            counter++; 
        } // end while loop
            if (sup>=inf){ // start if statement
                int index=center+1;
                System.out.println(userInput+" was found at index " +index);
                System.out.println("There were/was " +counter+ " iterations");
            }
            else{
                System.out.println(userInput+" was not found in the list with " +counter+ " iterations");
            } // end else if 
        } // end method
        
    public static void linearSearch(int [] array){ // linear search method
        Scanner myScanner; // declare 
        myScanner = new Scanner(System.in); // construct
        int userInput; // declare
        userInput=myScanner.nextInt(); // initalize
        for (int i=0;i<array.length; i++){ // start for loop
               if (array[i]==userInput){ // start if statement
                  System.out.println(userInput+" was found in the list with "+(i+1)+ " iterations.");
                  break;
               } // end if statement
         } // end for loop
    } // end method      

} // end class
