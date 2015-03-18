//  Rachel Sholder
//  CSE 02
//  HW 07

//  create number waves using loops

//  import scanner
import java.util.Scanner;

//  add class
public class waves{
    
//  add main method
    public static void main(String[] args){
    
    //  input scanner
    Scanner myScanner;
    myScanner= new Scanner(System.in); 
    
    //  prompt user to enter number for all 3 loops       
    System.out.print("Enter a number between 1 and 30: ");
    //  check validity
    while (!myScanner.hasNextInt()){ 
        //  error message
        System.out.println("Enter an integer"); 
        myScanner.next(); 
    }

    //  insert blank line
    System.out.println(""); 

    //  for loop

    System.out.println("FOR LOOP:"); 
    
    //  stores variable
    int number=myScanner.nextInt(); 
    //  if invalid input
    while (number<1 || number>30){ 
        System.out.println("Please enter a number between 0 and 30: "); 
        number=myScanner.nextInt(); 
    }
    
    //  for loop
    for(int i=1; i<=number; i=i+1){ 
        //  if even
        if(i%2==0){ 
            for(int counter=0; counter<i; counter=counter+1){ 
                for(int counter2=0; counter2<counter; counter2=counter2+1){  
                   System.out.print(i); 
                }
                System.out.println(i); 
            }
       
        }
        //  if odd
        else{ 
            for(int counter=i; counter>=1; counter=counter-1){ 
                for(int counter2=counter; counter2>1; counter2=counter2-1){ 
                   System.out.print(i);  
                }
                System.out.println(i);
            }
        }
    }
    
    System.out.println(""); 
    
    //  while loop
    System.out.println("WHILE LOOP:");  
    
    //  initialize loop
    int k=1;      
    while(k<=number){ 
        if(k%2==0){ 
            int counter4=0; 
            while(counter4<k){ 
                int counter5=0; 
                    while(counter5<counter4){  
                    System.out.print(k);  
                    counter5++; 
                }
                System.out.println(k); 
                counter4++; 
            }
        }
        else{ 
            int counter=k; 
            while(counter>=1){ 
               int counter2=counter; 
               counter=counter-1; 
               while(counter2>1){ 
                   System.out.print(k);   
                   counter2=counter2-1; 
                }
                System.out.println(k);
            }
        }
        k=k+1;    
    }
     
    //  insert blank line
    System.out.println(""); 
            
    //  do while loop 
    System.out.println("DO-WHILE LOOP:"); 
    
    //  initalize loop
    k=1; 
    do { 
        //  if even
        if(k%2==0){ 
            int counter4=0; 
            do{ 
                int counter5=0; 
                 do{ 
                   System.out.print(k);  
                   counter5++; 
                 } 
                 while(counter5<=counter4); 
                System.out.println(""); 
                counter4++; 
            }
            while(counter4<k); 
        }
    //  if odd
        else{ 
          
            int counter=k; 
            do{ 
                int counter2=counter; 
                counter=counter-1; 
                do{ 
                    System.out.print(k); 
                    counter2=counter2-1; 
                }
                while(counter2>=1); 
                
                //  insert blank line
                System.out.println(""); 
            } while(counter>=1);   

        }
        k=k+1; 
    } while(k<=number); 
            
        } // end main method
    } // end class