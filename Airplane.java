/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects_donuts;

/**
 *
 * @author nermin.khalefa
 */
public class Airplane {
    // public member varaibles 
    // we dont need to implement logic to change these values 
    String planename;
    int planeLengeth;
    int wingSize;
    
    // private member variable because i want to control 
    // outside classes acess these through methods
    private double currentSpeed;
    private int numPassengers;
    private int MaxNumPassengers;
    private boolean isEngineOn;
    
    
    public double getCurrentSpeed (){
        return currentSpeed;
        
        
    } // close method 
    
    
    public int getNumPassengers(){
        return numPassengers;
        
    
    }    // close method       
    
    public void setMaxNumPassengers(int num){
        MaxNumPassengers = num;  
    } // close method
    
    
     public void turnCarOn () {
        isEngineOn = true;
        System.out.println("...... vroom vroom, engine is on.....");
       
    } // close method 
    
    public void stopEngine(){
        isEngineOn = false;
        System.out.println(".... engine is not running....");
    } // close method 
    
    // allows access to our private engine status boolean memeber 
    // variable called isEngibeOn
    // return the status of the engine: true means on, false means off
    public boolean checkEngineStatus(){
        return isEngineOn;
    } // close method 
    
} // close class 
