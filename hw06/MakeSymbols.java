//  Rachel Sholder
//  CSE2
//  HW6

//  random number generator and symbol creations

//  define class
public class MakeSymbols {
    
//  define main method
    public static void main(String[] args){
        
        //  initialize
        int counter=1; 
        
        //  generate random number
        int number= (int)(Math.random()*100); 
        
        //  initalize string
        String even=""; 
        
        //  print random number
        System.out.println("Random number generated: "+number+""); 
        
        //  if odd
            String odd=""; 
            //  verify odd
            if(number%2!=0){ 
                do{ 
                    //  add & to string so * = random number
                    odd+="&";
                    counter++; 
                }
                while(counter<=number); 
                System.out.println("The output pattern: "+odd+""); 
            }

        //  if even 
            //  verify even and not zero
            if (number%2==0 && number!=0){ 
              
                do { 
                    //  add * to string so * = random number
                    even+="*"; 
                    counter++; 
                }
                while(counter<=number); 
                System.out.println("The output pattern: "+even+""); 
            }
            
            String zero=""; 
            //  if random number = 0
            if(number==0){ 
                System.out.println("The output pattern: "); 
                }
       
    }   // end main method
}   // end class
