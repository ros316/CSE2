//  Rachel Sholder
//  CSE 02
//  Lab 11

import java.util.Scanner;

public class lab11{
    //   add main method
    public static void main(String arg[])  {
        Scanner scan = new Scanner(System.in);
        int arraylength = 50;
        int[] array1 = new int[arraylength];
        int[] array2 = new int[arraylength];
        for(int i = 0; i < arraylength; i++){
            array1[i] = (int) (Math.random() * 101);
        }
        for(int i = 0; i < arraylength; i++){
            if (i==0){
                array2[i] = (int) (Math.random() * 101);
            }
            else{
                array2[i] = array2[(i-1)] + (int) (Math.random() * 101);
            }
        }
        int minimum1 = array1[0];
        int maximum1 = array1[0];
        for(int i = 0; i < arraylength; i++){
            if (array1[i] < minimum1){
                minimum1 = array1[i];
            }
            if (array1[i] > maximum1){
                minimum1 = array1[i];
            }
        }
        int maximum2 = array2[49];
        int minimum2 = array2[0];
        System.out.println("The maximum of array1 is: "+maximum1);
        System.out.println("The minumum of array1 is: "+minimum1);
        System.out.println("The maximum of array2 is: "+maximum2);
        System.out.println("The minumum of array2 is: "+minimum2);
        binarysearch(array2, arraylength);
    }
    
    public static void binarysearch(int[] array, int length){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int: ");
        if (scan.hasNextInt()){
            int userInput = scan.nextInt();
            if(userInput >= 0){
                int a = 0;
                int b = length;
                int c = (b+a)/2;
                while (b>(a+1)){
                    if (userInput == array[c]){
                        System.out.println(userInput+" was found in the list");
                        return;
                    }
                    else if(userInput < array[c]){
                        b = c;
                        c = (b+a)/2;
                    }
                    else if(userInput > array[c]){
                        a = c;
                        c = (b+a)/2;
                    }
                }
                if (userInput == array[c]){
                        System.out.println(userInput+" was found in the list");
                        return;
                    }
                else{
                    System.out.println(userInput+" was not found in the list");
                }
                if(userInput > array[c]){
                    System.out.println(array[c]+" was the number below the key");
                    System.out.println(array[(c+1)]+" was the number above the key");
                }
                else{
                    System.out.println(array[c-1]+" was the number below the key");
                    System.out.println(array[(c)]+" was the number above the key");
                }
                return;
            }
            else{
                System.out.println("You did not enter an int >= 0.");
                return;
            }
    }
        else{
            System.out.println("You did not enter an int.");
            return;
        }
    }
}