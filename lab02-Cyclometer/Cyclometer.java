//////////////////////////
// Rachel Sholder
// January 30th, 2015
// CSE02

//  My bicycle cyclometer records the number of minutes for both
//  trips and the distance for both trips

//  define a class
public class Cyclometer {
    
// add main method
        public static void main(String [] args) {

    // our input data
    int secsTrip1=480; // seconds for trip 1
    int secsTrip2=3220; // seconds for trip 2
    int countsTrip1=1561; // number of counts for trip 1
    int countsTrip2=9037; // number of counts for trip 2
    
    // our intermediate variables and output data
    double wheelDiameter=27.0, // the diameter of the wheel
    PI=3.14159, // math pi
    feetPerMile=5280, // feet per mile traveled
    inchesPerFoot=12, // inches per foot traveled
    secondsPerMinute=60; // seconds per minute traveled
    double distanceTrip1, distanceTrip2, totalDistance; // distance totals
    
    System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts. ");
    System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts. ");
    
    // run the calculations
    // calculating the distance for each trip and total distance
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    // above gives distance in inches
    // (for each count, a rotation of the wheels travels the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile;// gives distance in miles
    distanceTrip2=(countsTrip2*wheelDiameter*PI)/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
    //  Print out the output data
    
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");  
    

        }   //end of main method
}   //end of class