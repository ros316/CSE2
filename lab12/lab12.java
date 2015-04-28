//  Rachel Sholder
//  CSE 2
//  Lab 12

import java.util.Random;

public class lab12{
    public static void main(String arg[])  {
        Random rand = new Random();
        int height1 = rand.nextInt(3) + 2;
        int width1 = rand.nextInt(3) + 2;
        int height2 = rand.nextInt(3) + 2;
        int width2 = rand.nextInt(3) + 2;
        boolean format1 = true;
        boolean format2 = false;
        boolean format3 = true;
        int[][] myArray1 = increasingMatrix(height1, width1, format1);
        int[][] myArray2 = increasingMatrix(height1, width1, format2);
        int[][] myArray3 = increasingMatrix(height2, width2, format3);
        System.out.println("Generating a matrix with width "+width1+" and height "+height1);
        printMatrix(myArray1, format1);
        System.out.println("Generating a matrix with width "+width1+" and height "+height1);
        printMatrix(myArray2, format2);
        System.out.println("Generating a matrix with width "+width2+" and height "+height2);
        printMatrix(myArray3, format3);
        int[][] addedArray = addMatrix(myArray1, format1, myArray2, format2);
        System.out.println("Output:");
        printMatrix(addedArray, format1);
        int[][] addedArray2 = addMatrix(addedArray, format1, myArray3, format1);
        System.out.println("Output:");
        printMatrix(addedArray2, format1);
    }
        
    public static int[][] increasingMatrix(int height, int width, boolean format){
        int[][] array = new int[height][width];
        int numb = 1;
        if (format) { // generate row-major matrix
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    array[i][j] = numb;
                    numb++;
                }
            }
        } 
        else {
            for (int j = 0; j < width; j++) {
                for (int i = 0; i < height; i++) {
                    array[i][j] = numb;
                    numb++;
                }
            }
        }
        return array;
    }
    
    public static void printMatrix(int[][] array, boolean format){
        if(array == null){
            System.out.println("The array was empty!");
            return;
        }
        else{
            int i = 0;
            while (i<array.length){
                int j = 0;
                System.out.print("[ ");
                while (j<array[i].length){
                    System.out.print(array[i][j]+" ");
                    j++;
                }
            System.out.print("]");
            System.out.println("");
            i++;
            }
            return;
        }
    }
    
    public static int[][] translate(int[][] array1){
        System.out.println("Translating column major to row major input.");
        int height = array1.length;
        int width = array1[0].length;
        int[][] array2 = new int[height][width];
        int numb = 1;
        for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    array2[i][j] = numb;
                    numb++;
                }
        }
        return array2;
    }
    
    public static int[][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
        System.out.println("Adding two matrices.");
        if (formata == false){
            a = translate(a);
        }
        printMatrix(a, formata);
        System.out.println("Plus");
        if (formatb == false){
            b = translate(b);
        }
        printMatrix(b, formatb);
        if(a.length == b.length && a[0].length == b[0].length){
            int[][] array = new int[a.length][a[0].length];
            int i = 0;
            int j = 0;
            while (i < a.length){
                j = 0;
                while (j < a[0].length){
                    array[i][j] = a[i][j] + b[i][j];
                    j++;
                }
            i++;
            }
            return array;
        }
        else{
            System.out.println("Unable to add input matrices.");
            return null;
        }
    }
}