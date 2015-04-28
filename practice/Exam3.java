public static int [] expand(int[] in){
    
    int[] x = new int[in.length*2];
    for (int i=0; i<in.length; i++){
        x[i]=in[i];
    }
    return x;
}

public static int[] arrayStats(int[] array){
    int min=array[0];
    int max=array[0];
    
    for (int i: array){
        if (i>max){
            max=i;
        }
        if (i<min){
            min=i;
        }
    }
    
    return new int[]{min, max};
}



public static void swapMember(int [] A, int swapA, int swapB){
    
    if (swapA <0 || swapB <0 || swapA >= A.length ||
        swapB >= A.length) {
            System.out.println("Unacceptable input.");
            return;
            
        }
    
    
    int temp = A[swapA];
    A[swapA] = A{swapB];
    A[swapB] = temp;
    
    
}


public static int[] makeZero(int a){
    
    int result[] = new int[a];
    
    for (int i=0; i<a; i++){
        result[i]=0;
    }
    
    return result;
}


public static double getSum(double [] d){
    double sum = 0;
    for (double p:d){
        sum =+ p;
    }
    return sum;
}



public static boolean search(int[]x, int target,
    int minRange, int maxRange){
        
    if (minRange>maxRange || minRange<0 ||
        maxRange>x.length-1){
            return false;
        }
    
    for (int i=minRange; i=<maxRange; i++){
        if (x[i] == target){
            return true;
        }    
    }
}



public static void print(int[] x){
    if (x[0]>x.length-1){
        System.out.println("Error.");
    } else {
        System.out.print("{");
        for (int j=1; j<x[0]+1; j++){
            if (j>1){
                System.out.print(",");
            }
         System.out.print(x[j]);   
        }
        System.out.println("}");
        
    }
}

public static String[] range(String[] x){
    String minMax[]=new String[2];
    minMax[0]=x[0];
    minMax[1]=x[0];
    for (int i=1; i<x.length; i++){
        
    }
    return minMax;
}



public static int[] overlap(int[] x, int[] y){
    int temp[];
    if(x.length>y.length){
        temp=new int[x.length+1];
    } else {
        temp=new int[y.length+1];
    }
    
    temp[0]=0;
    
    
    
}












