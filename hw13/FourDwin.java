//  Rachel Sholder
//  CSE 02 
//  HW 13

import java.util.Scanner; //import scanner
import java.util.Random; //import random 

public class FourDwin{
    public static void main(String arg[])  {
        Scanner myScanner; // declare scanner
        myScanner= new Scanner(System.in); // construct scanner
        Random rand; // declare rand
        rand = new Random(); // construct rand
        
        System.out.print("Enter an integer X: "); // prompt user
        int x = myScanner.nextInt();
        System.out.print("Enter an integer Y where Y > X: "); // promt user
        int y = myScanner.nextInt();
        while (y <= x) { // start while loop
            System.out.print("Invalid input. Please enter an integer for Y > X: "); // invalid input print
            y = myScanner.nextInt();
        } // end while loop
        
        // Generate Array
        double[][][][] a = new double[3][][][]; // construct array
        for (int i = 0; i < a.length; i++) { // start outermost for loop
            int b = rand.nextInt(y - x) + x;
            a[i] = new double[b][][];
            for (int j = 0; j < b; j++) { // start second for loop
                int c = rand.nextInt(y - x) + x;
                a[i][j] = new double[c][];
                for (int k = 0; k < c; k++) { // start for loop
                    int d = rand.nextInt(y - x) + x;
                    a[i][j][k] = new double[d];
                    for (int l = 0; l < d; l++) { // start innermost for loop
                        double val = rand.nextInt(300) / 10.0;
                        a[i][j][k][l] = val;
                    } // end innermost for loop
                } // end for loop
            } // end inner for loop
        } // end outermost for loop
        
        System.out.println("Original Array:");
        printArray(a); // calls on print array method
        sort3DArray(a); // calls on sort 3D array method
        sort4DArray(a); // calls on sort 4D array method
        System.out.println("Sorted Array:");
        printArray(a); // calls on print array method
        statArray(a); // calls on statArray method

    } // end main method
    
    public static void printArray(double[][][][] a) {
        System.out.println("{");
        for (int i = 0; i < a.length; i++) { // start outermost for loop
            System.out.println("  {");
            for (int j = 0; j < a[i].length; j++) { // start second for loop
                System.out.println("    {");
                for (int k = 0; k < a[i][j].length; k++) { // start third for loop
                    System.out.print("      {");
                    for (int l = 0; l < a[i][j][k].length; l++) { // start innermost for loop
                        System.out.printf("%.1f", a[i][j][k][l]);
                        if (l < a[i][j][k].length - 1) { // start if statement
                            System.out.print(", ");
                        } // end if statement
                    } // end innermost for loop
                    System.out.print("}");
                    if (k < a[i][j].length - 1) { // start if statement
                        System.out.print(",");
                    } // end if statement
                    System.out.println();
                } // end third for loop
                System.out.print("    }");
                if (j < a[i].length - 1) { // start if statement
                    System.out.print(",");
                } // end if statement
                System.out.println();
            } // end second for loop
            System.out.print("  }");
            if (i < a.length - 1) { // start if statement
                System.out.print(",");
            } // end if statement
            System.out.println();
        } // end outermost for loop
        System.out.println("}");
    } // end print array method
    
    public static void statArray(double[][][][] a) {
        int count = 0; // initalize
        double sum = 0; // initialize 
        for (int i = 0; i < a.length; i++) { // start outermost for loop
            for (int j = 0; j < a[i].length; j++) { // start second for loop
                for (int k = 0; k < a[i][j].length; k++) { // start third for loop
                    for (int l = 0; l < a[i][j][k].length; l++) { // start innermost for loop
                        count++;
                        sum += a[i][j][k][l];
                    } // end innermost for loop
                } // end third for loop
            } // end second for loop
        } // end outermost for loop
        
        System.out.println("Members:\t" + count); // print
        System.out.println("Sum:\t" + sum); // print
        System.out.println("Mean:\t" + (sum / count)); // print
    } // end stat array method

    public static void sort4DArray(double [][][][] array){
        for (int i = 1; i < array.length; i++) { // start outermost for loop
            for (int j = i; j > 0 && array[j - 1].length > array[j].length; j--) { // start innermost for loop
                double[][][] temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            } // end innermost for loop
        } // end outermost for loop
    } // end sort4Darray
    
    public static void sort3DArray(double [][][][] array){
        for (int i = 0; i < array.length; i++) { // start outermost for loop
            for (int j = 0; j < array[i].length; j++) { // start second for loop
                for (int k = 0; k < array[i][j].length; k++) { // start third for loop
                    double[] nums = array[i][j][k];
                    int first; // initialize
                    double temp;  // initialize
                    for (int a = nums.length - 1; a > 0; a--) { // start fourth for loop
                          first = 0;
                          for (int b = 1; b <= a; b++) { // start innermost for loop
                               if(nums[b] > nums[first]){
                                 first = b;
                               }
                          } // end innermost for loop
                          temp = nums[first];
                          nums[first] = nums[a];
                          nums[a] = temp; 
                      } // end fourth for loop
                } // end third for loop
            } // end second for loop
        } // end outermost for loop
    } // end sort 3D array

} // end class 