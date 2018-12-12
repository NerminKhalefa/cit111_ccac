package javafinal;

import java.util.Scanner;

/**
 * class to test my airplane
 * "blueprint" class
 * @author nermin.khalefa
 */
public class JAVA111_Nermin_finalProject_AirPlaneLand {
    // no mem airplanes 
    public static void main (String[] args){
        // create a new instance of a airplane object with the keyword
        JAVA111_Nermin_finalProject_Airplane unitedNations = new JAVA111_Nermin_finalProject_Airplane();
        unitedNations.planeLengeth = 45;
        unitedNations.planeName = "unitedNations";
        unitedNations.wingSize = 60; 
        JAVA111_Nermin_finalProject_Airplane EgyptAir = new JAVA111_Nermin_finalProject_Airplane();
        EgyptAir.planeLengeth = 55;
        EgyptAir.planeName = "EgyptAir";
        EgyptAir.wingSize = 65; 
        
        unitedNations.startEngine();
        unitedNations.setCurrentSpeed(100);
        unitedNations.setNumPassengers(50);
        unitedNations.setMaxNumPassengers(75);
        
        EgyptAir.startEngine();
        EgyptAir.setCurrentSpeed(200);
        EgyptAir.setNumPassengers(45);
        EgyptAir.setMaxNumPassengers(85);
        
        Scanner keyboard = new Scanner(System.in);
        // loop to ask user to print out stats to print out for airplanes 
        System.out.println("Welcome to the airplane program!");
        while (true) {
            System.out.println("Press 1 to show stats of United Nations, 2 for stats of Egypt Air, anything else to exit");
            // get user input 
            String line = keyboard.nextLine();
            if (line.equals("1")) {
                System.out.println(unitedNations);
            } else if (line.equals("2")) {
                System.out.println(EgyptAir);
            } else {
                break;
            }
        }
        System.out.println("Thank you and goodbye!");
                
    } // close main 
    
    
} // close class 
