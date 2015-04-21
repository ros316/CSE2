//  Rachel Sholder
//  HW 12
//  CSE 2

import java.util.Scanner;
import java.util.Random;

public class Multiply{ //define a class
    public static void main(String[] args){ //define main method
        
        Scanner myScanner; // declare scanner
        myScanner = new Scanner(System.in); // construct scanner
        
        System.out.println("You will be prompted to enter the width and height of two matrices."); //prompt user
        
        System.out.print("Width 1: "); //prompt user
        
            while (!myScanner.hasNextInt()){ //makes sure input is an integer
                System.out.println("Please enter an integer.");
                System.out.println("Width 1: ");
                myScanner.next();
            } // end while loop
            
            int width1=myScanner.nextInt(); //assigns user input to a variable
            while (width1<=0){ //checks to see if integer is greater than zero
                System.out.println("Please enter an integer greater than zero.");
                System.out.println("Width 1: ");
                width1=myScanner.nextInt();
            } // end while loop
        
        System.out.print("Height 1: ");
        
            while (!myScanner.hasNextInt()){  //makes sure input is an integer
                System.out.println("Please enter an integer.");
                System.out.println("Height 1: ");
                myScanner.next();
            } // end while loop
            
            int height1=myScanner.nextInt();
            while (height1<=0){ //checks to see if integer is greater than zero
                System.out.println("Please enter an integer greater than zero.");
                System.out.println("Height 1: ");
                height1=myScanner.nextInt();
            } // end while loop
        
        System.out.print("Width 2: ");
        
            while (!myScanner.hasNextInt()){  //makes sure input is an integer
                System.out.println("Please enter an integer.");
                System.out.println("Width 2: ");
                myScanner.next();
            } // end while loop
            
            int width2=myScanner.nextInt();
            while (width2<=0){ //checks to see if integer is greater than zero
                System.out.println("Please enter an integer greater than zero.");
                System.out.println("Width 2: ");
                width2=myScanner.nextInt();
            } // end while loop
        
        System.out.print("Height 2: ");
        
            while (!myScanner.hasNextInt()){  //makes sure input is an integer
                System.out.println("Please enter an integer.");
                System.out.println("Height 2: ");
                myScanner.next();
            } // end while loop
            
            int height2=myScanner.nextInt();
            while (height2<=0){ //checks to see if integer is greater than zero
                System.out.println("Please enter an integer greater than zero.");
                System.out.println("Height 2: ");
                height2=myScanner.nextInt();
            } // end while loop
        
        while (width1!=height2){ // checks to see if matrices are compatible 
            System.out.println("The matrices cannot be multiplied. Please try again.");
            System.out.println("Enter a new width and height for Matrix 2: ");
            width2=myScanner.nextInt();
            height2=myScanner.nextInt();
        } // end while loop

        System.out.println("Matrix A with width "+width1+" and height "+height1+":");
        int [][] ArrayA = randomMatrix(height1, width1); //call randomMatrix Method to create matrix A
        printMatrix(ArrayA); //calls print method to print matrix A
        System.out.println("Matrix B with width "+width2+" and height "+height2+":");
        int [][] ArrayB = randomMatrix(height2, width2); //call randomMatrix Method to create matrix B
        printMatrix(ArrayB); //calls print method to print matrix B
        System.out.println("Matrix A x B:");
        int [][] ArrayAB = matrixMultiply(ArrayA, ArrayB); //mutiply the matricies
        printMatrix(ArrayAB); //calls print method to print matrix AB

    } // end main method


    public static int[][] randomMatrix(int height, int width){
        Random random = new Random(); //declare random
        int[][] matrix = new int[height][width]; //declare array
        for (int i = 0; i < height; i++) { // start for loop
            for (int j = 0; j < width; j++) { // start innermost for loop
                matrix[i][j] = random.nextInt(21) - 10; 
            } // end innermost for loop
        } // end for loop
        return matrix; //return 
    } // end random method

    public static void printMatrix(int [][]array){ 
        for(int i=0; i<array.length; i++){ //iterates each row, start for loop
            for (int j=0; j<array[i].length; j++){ //iterates each element of row, start innermost for loop
                System.out.print(array[i][j]+" "); //print
            } // end innermost for loop
            System.out.println(); 
        } // end for loop
    } // end print method
 
    public static int[][] matrixMultiply(int a[][], int b[][]){ 
        if (a[1].length!=b.length){ //if the width of matrix A is not equal to the length of matrix B
            System.out.println("The dimensions of your matrices do not match up."); //print error
            return null; //return nothing
        }
        int [][] matrixAB=new int[a.length][b[1].length];
        for (int i=0; i<a.length; i++){ //iterates each row of array a
            for (int j=0; j<b[1].length; j++){ // iterates array B columns
                for(int k=0; k<a[1].length; k++){ // iterates array A columns
                  matrixAB[i][j]+=a[i][k]*b[k][j]; //multiplies two matrices
                } // end innermost for loop         
            } // end for loop
        } // end outermost for loop
        return matrixAB;
    } // end matrix multiply method
    
} // end class

