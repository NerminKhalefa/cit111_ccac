/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunck2methods;
import java.util.Random;

/**
 *
 * @author nermin.khalefa
 */
public class refactorTheRing {
        static int numViewersSwallowedByRing = 0;
    // chop main up and call the new methods as needed
        
        public static void displayWatchedMessage(String viewerName){
            System.out.println(viewerName + "watched the tape; 7 days to live");
        } // close method
        
    public static void main(String[] args) {
        
        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";
        
        displayWatchMessage(viewer1);
        displayWatchedMessage(viewer2);
        displayWatchedMessage(viewer3);
        displayWatchedMessage(viewer4);
        DisplayWatchedMessage(viewer5);
        System.out.println("****************************************");
        
        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 1 named " + viewer1 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer1 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer1 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 2 named " + viewer2 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer2 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer2 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 3 named " + viewer3 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer3 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer3 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 4 named " + viewer4 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer4 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer4 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 5 named " + viewer5 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer5 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer5 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        } // close if else
        
    } // close main
    
  
    public static void doNotRepeatMySelef(){
        
    } // close method 
    
    
} // close class 
