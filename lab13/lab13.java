//  Rachel Sholder
//  CSE 2
//  Lab 13

import java.util.Random;

public class lab13{
    public static void main(String arg[])  {
        Random rand = new Random();
        int[][] myArray = new int [5][];
        int j = 0;
        while (j<5){
            myArray[j] = new int [j*3 + 5];
            j++;
        }
        int i = 0;
        j = 0;
        while (j < myArray.length){
            i = 0;
            while(i < myArray[j].length){
                myArray[j][i] = rand.nextInt(40);
                i++;
            }
            j++;
        }
        j = 0;
        i = 0;
        System.out.println("Unsorted Array");
        while (j < myArray.length){
            System.out.print("row "+(j+1)+": ");
            i = 0;
            while(i < myArray[j].length){
                if(myArray[j][i] < 10){
                    System.out.print(" ");
                }
                System.out.print(myArray[j][i]+" ");
                i++;
            }
            System.out.println("");
            j++;
        }
        j = 0;
        while (j < myArray.length){
            sortArray(myArray[j]);
            j++;
        }
        j = 0;
        i = 0;
        System.out.println("Sorted Array");
        while (j < myArray.length){
            System.out.print("row "+(j+1)+": ");
            i = 0;
            while(i < myArray[j].length){
                if(myArray[j][i] < 10){
                    System.out.print(" ");
                }
                System.out.print(myArray[j][i]+" ");
                i++;
            }
            System.out.println("");
            j++;
        }
        int[][] copiedArray = new int [5][];
        int maxlength = 0;
        i = 0;
        while(i<5){
            if(myArray[i].length>maxlength){
                maxlength = myArray[i].length;
            }
            i++;
        }
        j = 0;
        while (j<5){
            copiedArray[j] = new int [maxlength];
            j++;
        }
        i = 0;
        j = 0;
        while (j < copiedArray.length){
            i = 0;
            while(i < copiedArray[j].length){
                if(i < myArray[j].length){
                    copiedArray[j][i] = myArray[j][i];
                }
                else{
                    copiedArray[j][i] = 0;
                }
                i++;
            }
            j++;
        }
        i = 0;
        j = 0;
        System.out.println("Sorted & Copied Array");
        while (j < copiedArray.length){
            System.out.print("row "+(j+1)+": ");
            i = 0;
            while(i < copiedArray[j].length){
                if(copiedArray[j][i] < 10){
                    System.out.print(" ");
                }
                System.out.print(copiedArray[j][i]+" ");
                i++;
            }
            System.out.println("");
            j++;
        }
    }
    
    public static void sortArray(int [] array){
        int a = 0;
        int min = array[0];
        while (a < array.length){
            int b = a;
            min = array[a];
            int numb = a;
            while (b < array.length){
                if (array[b] < min){
                    min = array[b];
                    numb = b;
                }
                b++;
            }
            int temp = array [a];
            array [a] = min;
            array [numb] = temp;
            a++;
        }
    }
}