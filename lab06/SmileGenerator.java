//  Rachel Sholder
//  CSE 02
//  Lab 6

//  familiarity with loops
//  smile generator

//  add class and main method
public class SmileGenerator {
    public static void main (String [] args) {
    
//  step 1: non-nested for loops, while loops, do-while loops


    //  non-nested for loops
	int counter=1;  
	String smile=" "; 
	for (counter=1;counter<=5;counter++){ 
	     smile += ":)"; 
	     
	  }
    System.out.println(""+smile); 
	 
	 
    //  while loops
	 counter=1; 
	 String smile2=" "; 
	 while (counter<=5) { 
	 smile2 += ":)"; 
	 counter++; 
	 }
	 System.out.println(""+smile2); //print the total string

    //  do while loops
    counter=1; 
    String smile3=" "; 
    do {
        smile3+=":)"; 
        counter++;
    }
        while(counter<=5); 
    System.out.println(""+smile3); 

//  step 2: random number of smiley faces

    //  generate and print random number of smileys
    int randomSmiles = (int)(1 + Math.random()*100);
    //  print the random number
    System.out.println(""+randomSmiles); 
    int counter2=1; //initialize the counter
    String smile4=" "; //initialize the string
        for(counter2=1;counter2<=randomSmiles;counter2++){ 
          smile4+=":)"; 
        }

//  step 3: liimits number per line

    int counter3=1; 
    int lines=(int)(randomSmiles/30); 
    for(counter3=1;counter3<=lines;counter3++){ 
     System.out.println(" :):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)");
     }
     
    int counter4=1; 
    int extra=(int)(randomSmiles%30); 
    String smileLimit=" "; 
     
    for(counter4=1;counter4<=extra;counter4++){ 
        smileLimit+=":)";
     }
        System.out.println(smileLimit); 

//  step 4: increases number of smiley faces per line

    int newLine=0; 
    if(extra>0){ 
         newLine=1; 
    }
    
    
        
    String smileInc = ""; 
    for(counter3=1;counter3<=lines+newLine;counter3++){ 
       smileInc+=":)"; 
        System.out.println(smileInc); 
    }
        
    } // end main method
} // end class


  
 