/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author nermin.khalefa
 */
import java.util.Scanner;

public class WhileWithScanner {
    public static void main(String [] args) {
        int numLoops = 0;
        int loopControl; 
        // build a scanner object
        Scanner Scanner = new Scanner(System.in);
        // prompt user and get an int from them 
        System.out.println("How many loops shall i print?");
        loopControl = Scanner.nextInt();
        // loop as long as numloops is less than or equal to our loopControl
        // which we gathered from the user 
        while(numLoops <= loopControl){
            System.out.println("The value of numLoops: " + numLoops);
            // add one to numLopps each time we cycle so we only
            // loop the number of times theuser imputed
            numLoops = numLoops + 1;
        } // close while 
        System.out.println(".... After the while Loop");
        
    } // close main
    
} // close class 
