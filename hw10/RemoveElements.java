//  Rachel Sholder
//  CSE 02
//  HW 10

import java.util.Scanner;   // import scanner

public class RemoveElements{    // declare class

    public static void main(String [] arg){   // declare main method
        Scanner scan=new Scanner(System.in);  // declare and construct scanner
      
        int num[]=new int[10];  // initalize array
        int newArray1[];    // declare new array
        int newArray2[];    // declare second array
        int index,target;   // declare variables 
    
    	String answer="";   // initialize answer
    	do{ // start do while loop
          	System.out.print("Random input 10 ints [0-9]"); // print
          	num = randomInput();    // calls method
          	String out = "The original array is:";
          	out += listArray(num);  // assigns
          	System.out.println(out);    // prints
         
          	System.out.print("Enter the index ");   // prompt
          	index = scan.nextInt();     // assigns
          	newArray1 = delete(num,index);  //  assigns
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
         
            System.out.print("Enter the target value ");
          	target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2="The output array is ";
          	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
          	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer=scan.next();
    	}while(answer.equals("Y") || answer.equals("y")); // end do while loop
    } // end main method
 
    public static String listArray(int num[]){    // prints new array
    	String out="{";
    	for(int j=0;j<num.length;j++){
      	if(j>0){
        	out+=", ";
      	}
      	out+=num[j];
    	}
    	out+="} ";
    	return out;
    } // end method
  
    public static int[] randomInput() { // generates 10 random ints 
        int[] a = new int[10];  // initialize with lenght of 10
        for (int i = 0; i < 10; i++) { //sets up loop to add one rand int to every index 
            a[i] = (int)(Math.random() * 10);   // generator
        }
        return a;   // return output to main
    }   // end method
    
    public static int[] delete(int[] list, int pos) { //method that deletes the index value that the user specifies
        if (pos >= list.length) {
            System.out.println("Index out of bounds!");
            System.exit(1);
        }
        int[] a = new int[list.length - 1];
        for (int i = 0; i < list.length - 1; i++) {
            if (i < pos) {
                a[i] = list[i];
            } else {
                a[i] = list[i + 1];
            }
        }
        return a;   // return output array to main
    }   // end method
    
    public static int[] remove(int[] list, int target) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                count++;    // increment
            }
        }
        int[] a = new int[list.length - count];
        for (int i = 0, j = 0; i < list.length; i++) { //begin loop to run through each index of input array
            if (list[i] != target) {  //if input does not contain value sepcified
                a[j] = list[i]; //then set index value equal to index value of output array
                j++;     // increment
            }
        }
        return a;   // return output to main
    }   // end method
  
} // end class
