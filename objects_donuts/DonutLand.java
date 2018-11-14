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
public class DonutLand {
    
    public static void main(String [] args){
        // instantiating a new Donut 
        // store a reference to this particular 
        // Donut in a variable called firstDonut
       Donut firstDonut = new Donut(); 
       firstDonut.name = "Nemo"; 
       firstDonut.donutType = "Chocolate";  
       firstDonut.size = "Tiny";
        System.out.println("Checking firstDonut percent");
        System.out.println( firstDonut.getPercRemaining() ); 
        
        
       // call simulate eating 
       firstDonut.simulateEating(12);
        System.out.println( "Percent Remaining of Donut " +firstDonut.getPercRemaining());
       firstDonut.simulateEating(25);
        System.out.println("Percent Reamining of Donut " +firstDonut.getPercRemaining());
       
       // accessing memeber variables on a Donut
       // objects we created 
       
        System.out.println("FirstDonut's name: " + firstDonut.name);
        
        Donut secondDonut = new Donut ();
       secondDonut.name = "Dory";
       secondDonut.donutType = "Cinnamon Spice";
       secondDonut.size = "Jumbo";
        System.out.println("SecondDonut's name: " + secondDonut.name);
  
    } // close main 
    
} // close class 
