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
public class Petrushka {
    
    public static void main(String[] args){
        // create am array object that stores only strings 
        // and store a reference to that array in the variable petrushka 
        String[] petrushka = new String[5]; 
        
        petrushka[0] = "Bob Belcher";
        petrushka[1] = "Tina Belcher";
        petrushka[2] = "Linda Belcher";
        petrushka[3] = "Gene Belcher";
        petrushka[4] = "Louise Belcher";
        printArrayContents(petrushka);
  
        
    } // close main
        public static void printArrayContents(String[] arrayInsideMethod){
            System.out.println("************* Extract array value and store it ********");
            // extract contents of each array bin, then print it to the console
            System.out.println("Petrushka at array at index 0: " + arrayInsideMethod[0]);
            // do this process for each bin of the array
            System.out.println("Petrushka at array at index 1: " + arrayInsideMethod[1]);
            System.out.println("Petrushka at array at index 2: " + arrayInsideMethod[2]);
            System.out.println("Petrushka at array at index 3: " + arrayInsideMethod[3]);
            System.out.println("Petrushka at array at index 4: " + arrayInsideMethod[4]);
            
        }
        
        
        
        
        
    
} // close class
