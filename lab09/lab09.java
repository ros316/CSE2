//  Rachel Sholder
//  CSE 02
//  Lab 09

import java.util.Random;
import java.util.Scanner;

public class lab09 {
    
    static Random randomGenerator = new Random();
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = "y";
        while (input.equals("y") || input.equals("Y")) {

            System.out.print("The "
                + adjective()
                + " " + adjective()
                + " " + subjectNoun()
                + " " + verb()
                + " the " + adjective()
                + " " + objectNoun());
            
            System.out.println();
            
            System.out.print("Would you like another sentence? Press Y or y for yes, anything else to quit-");
            
            input = scanner.next();
        }
    }
    
    public static String adjective() {
        switch (randomGenerator.nextInt(10)) {
            case 0:
                return "slimy";
            case 1:
                return "tall";
            case 2:
                return "salty";
            case 3:
                return "pink";
            case 4:
                return "stupid";
            case 5:
                return "short";
            case 6:
                return "smart";
            case 7:
                return "old";
            case 8:
                return "fat";
            default:
                return "tiny";
        }
    }
    
    public static String subjectNoun() {
        switch (randomGenerator.nextInt(10)) {
            case 0:
                return "Rachel";
            case 1:
                return "puppy";
            case 2:
                return "turtle";
            case 3:
                return "table";
            case 4:
                return "boy";
            case 5:
                return "basket ball";
            case 6:
                return "car";
            case 7:
                return "water bottle";
            case 8:
                return "pen";
            default:
                return "sorority girl";
        }
    }
    
    public static String verb() {
        switch (randomGenerator.nextInt(10)) {
            case 0:
                return "drank";
            case 1:
                return "passed";
            case 2:
                return "ate";
            case 3:
                return "escaped from";
            case 4:
                return "attacked";
            case 5:
                return "trapped";
            case 6:
                return "pushed";
            case 7:
                return "looked at";
            case 8:
                return "murdered";
            default:
                return "drew";
        }
    }
    
    public static String objectNoun() {
        switch (randomGenerator.nextInt(10)) {
            case 0:
                return "hair";
            case 1:
                return "stairs";
            case 2:
                return "pear";
            case 3:
                return "squirrel";
            case 4:
                return "paper";
            case 5:
                return "towel";
            case 6:
                return "clock";
            case 7:
                return "pillow";
            case 8:
                return "photograph";
            default:
                return "fraternity boy";
        }
    }
    
    
}