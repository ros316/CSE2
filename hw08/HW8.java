//  Rachel Sholder
//  CSE 02
//  HW 08

//  this progam creates a game

//  import scanner
import java.util.Scanner;

//  declare class
public class HW8 {

    //  declare main method
    public static void main(String[] args) {
        char option;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave(); // call on cave method
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();    // call on giant method
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 treasure box in front of you! Enter the box number you want to open!");
        box();  //  call on box method
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    //  print out the giant
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    //  print out the cave
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //  print out the box
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    public static String getInput(Scanner scan) {
        //  declares variable
        int num = scan.nextInt();
        //  pick box
        switch (num) {
            case 1:
                System.out.println("Congrats! You get a 4.00 GPA!");
                break;
            case 2:
                System.out.println("Congrats! You just won the lottery!");
                break;
            case 3:
                System.out.println("Congrats! You just won a free trip to Cancun!");
                break;
            default:
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
                break;
        }
        return "";
    }
    
    public static String getInput(Scanner scan, String string) {
        //  initialize variable
        String input = scan.next();
        //  match
        if (string.contains(input)) {
            return "CONTINUE";
        } else {
            //  doesn't match
            System.out.println("Yea right LOSER!");
            System.exit(0);
            return "";
        }
    }
    
    public static String getInput(Scanner scan, String string, int trial) {
        int i = 0;  // initialize
        while (i < trial) { // run until less than 10
            String input = scan.next();
            if ("Aa".contains(input)) {
                int rand = (int)(Math.random() * 2); // 0 or 1
                if (rand == 0) {
                    System.out.println("Hit!");
                    i++;    // increments only for hit
                } else {
                    System.out.println("Miss!");
                }
            } else if ("Ee".contains(input)) {
                int rand = (int)(Math.random() * 10); // number from 0-9 generated
                if (rand == 0) { // if number is 0
                    System.out.println("You escaped!");
                    return "";
                }
            } else { // not 0
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
            
            if (i < trial) {
                //  print
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            }
        }
        return ""; //   return empty string
    }


} // end class
