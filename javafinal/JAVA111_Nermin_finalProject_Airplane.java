/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

/**
 *
 * @author nermin.khalefa
 */
public class JAVA111_Nermin_finalProject_Airplane {
    // public member varaibles 
    // we dont need to implement logic to change these values 
    String planeName;
    int planeLengeth;
    int wingSize;
    
    // private member variable because i want to control 
    // outside classes acess these through methods
    private double currentSpeed;
    private int numPassengers;
    private int MaxNumPassengers;
    private boolean isEngineOn;
    
   // mutator for currentSpeed
    public void setCurrentSpeed(double s){
//        if (s < 0) {
//            throw new IllegalArgumentException("Current speed cannot be negative");
//        }
        if (isEngineOn) {
            currentSpeed = s;
        } 
    } // close method 
    
    // accessor for currentSpeed
    public double getCurrentSpeed (){
        return currentSpeed;
        
        
    } // close method 
    
    // mutator for numPassengers
    public void setNumPassengers(int n) {
        numPassengers = n;
    }
    
    // accessor for getNumpagengeers
    public int getNumPassengers(){
        return numPassengers;
        
    
    }    // close method       
    
    // mutator for MaxNumPassengers 
    public void setMaxNumPassengers(int MaxNumPassengers){
        this.MaxNumPassengers = MaxNumPassengers;  
    } // close method
    
    
    // start the engine
     public void startEngine () {
        isEngineOn = true;
        System.out.println("****** Engine has started******");
       
    } // close method 
    
     // stop engine
    public void stopEngine(){
        isEngineOn = false;
        System.out.println("******** engine has stopped****** ");
    } // close method 
    
    // allows access to our private engine status boolean memeber 
    // variable called isEngineOn
    // return the status of the engine: true means on, false means off
    public boolean checkEngineStatus(){
        return isEngineOn;
    } // close method 
    
    // display airplane variables
    public String toString() {
        return "Airplane '" + planeName + "':\n" 
                + "\tlength: " + planeLengeth + "\n"
                + "\twing size: " + wingSize + "\n" 
                + "\tpassengers: " + numPassengers + "\n"
                + "\tmax passengers: " + MaxNumPassengers + "\n"
                + "\tengine is on: " + isEngineOn + "\n"
                + "\tcurrentSpeed: " + currentSpeed;
    }
} // close class 
