/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package classStructure;



import java.util.Random;



/**

 *

 * @author nermin.khalefa

 */

public class KennywoodRideTracker {



    static int totalRider = 0;

    static int totalFailedRideAttempts = 0;

    static int totalSickRiders = 0;

    public static final int THRILLRIDE = 66;

    public static final int THEMERIDE = 60;



    // *****START MAIN******

    public static void main(String[] args) {
        
      System.out.println("Begin ride simulation");
    printRiderStats();
        
        // ride the ride by calling its ride method, then print stats
        rideBlackWidow(12, 55);
        printRiderStats();
        
        rideMerryGoRound(7, 34);
        printRiderStats();
        
        rideMerryGoRound(2, 44);
        printRiderStats();
        
         rideBlackWidow(12, 55);
        printRiderStats();
        
        rideBlackWidow(12, 20); // very short folks
        printRiderStats();
    
    } // close main 

    // this method is called to stimulate therideblackwidow and you have to pass in two ints

    // ( rider and min hieght)

    public static void rideBlackWidow(int riders, int minHeight) {

        if (minHeight >= THRILLRIDE){

        System.out.println("Welcome Black Widow riders! ");

        System.out.println("This is an awesome ride!!! ");

        totalRider = totalRider + riders;   

        Random rand = new Random();

        int numSickRiders = rand.nextInt(riders);

        totalSickRiders = totalSickRiders + numSickRiders; 

        } else {

            System.out.println(riders + " Riders turned away upset: too Short!");

            totalFailedRideAttempts = totalFailedRideAttempts + riders;

        } // close if/ else


    } // close method 



    public static void rideMerryGoRound(int riders, int minHeight) {
 if (minHeight >= THRILLRIDE){

        System.out.println("Welcome Merrry Go Round riders! ");

        System.out.println("This is an awesome ride!!! ");

        totalRider = totalRider + riders;   

        Random rand = new Random();

        int numSickRiders = rand.nextInt(riders);

        totalSickRiders = totalSickRiders + numSickRiders; 

        } else {

            System.out.println(riders + " Riders turned away upset: too Short!");

            totalFailedRideAttempts = totalFailedRideAttempts + riders;


    } // close method


    
    public static void printRideStats(){
                System.out.println("*******RIDER STATS*********");
        System.out.println("Total Riders: " + totalRider);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total sick riders: " + totalSickRiders);
        System.out.println("***************************\n");


    } // close method

    private static void printRiderStats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } // close printRiderStats

} // close class         