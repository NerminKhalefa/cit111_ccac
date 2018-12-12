package objects_donuts;

/**
 * class to test our care
 * "blueprint" class
 * @author nermin.khalefa
 */
public class CarLand {
    // no mem cars
    public static void main(String [] args) {
        // create a new instance of a car objects with the keyword
    Car xRacer = new Car();
    xRacer.makeModel = "BMW 3 series";
    xRacer.year = 2018;
    
    // set member variable on the instance of car stored in xRacer
    xRacer.vinNum= 355896;
    displayCarStatus(xRacer);
    // test its methods 
    xRacer.turnCarOn();
    xRacer.accelerate(54);
    xRacer.decelerate(16);
    // check status again 
    displayCarStatus(xRacer); 
    xRacer.stopEngine();
    displayCarStatus(xRacer);
    Car street_Racer = new Car();
    // set member variable instance of car objects with the keyword
    street_Racer.vinNum = 592631;
    street_Racer.makeModel = "porsche BOXSTER";
    street_Racer.year = 1992;
    
    } // close method 
    
            // send our car instance to a helper method to print its member variable 
    public static void displayCarStatus(Car anyCarObject){
        System.out.println("..... CAR STATUES.....");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println(" Engine On? " + anyCarObject.checkEngineStatus());
        System.out.println("currentSpeed " + anyCarObject.currentSpeed());
        System.out.println("................");
        
    } // close method 
    
    
}  // close class 
