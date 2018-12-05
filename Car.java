
package objects_donuts;

/**
 * models a car
 * @author nermin.khalefa
 */
public class Car {
    // public member varivales:
    // we dont need to implement logic to change these values
    public int vinNum;
    public int year;
    public String makeModel; 
    
    // private member variables because we want to control 
    // their values: outside classes access these through methods
     
    private boolean isEngineOn;
    private double currentSpeed;
    
    
    // simulate starting this car instants engine 
    // methods 
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
        
    }// close method 
    
    // allows acess to our private speed variable 
    // returns this car objects current speed
    public double currentSpeed(){
        return currentSpeed; 
        
    } // close method 
    
    // controls the car increases in speed
    // return the current speed of the car after the acceleration
    // has been taken into account 
    
    public void accelerate (int mphIncrease){
        currentSpeed = currentSpeed + mphIncrease;
        
    } // close method
    
    // controls the cars decrease in speed
    // the current speed of the car after the deceleration 
    public double decelerate(int mphDecrease){
        currentSpeed = currentSpeed - mphDecrease;
        return currentSpeed; 
        
    } // close method 
    
    
    
    
} // close class 
