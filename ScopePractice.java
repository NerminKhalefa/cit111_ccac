/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classStructure;

/**
 *
 * @author nermin.khalefa
 */

public class ScopePractice {
    // member variable: accessible to all
    // methods in class S
     public static String classScope = "every method can see me!";
    // sample scope testing 
    public static void testScope(){
        System.out.println("Inside testScope");
        // make local variable type string called s 
        String s = "s local to testScope";
        System.out.println(s);  
        System.out.println(classScope);
    } // close testScope
    
    
    public static void main (String[] args) {
        System.out.println("In main ...");
        // make type string called r
        // store it in "local main"
        String r = "r local main";
        System.out.println(r);
        testScope();
        System.out.println("classScope");
        classScope = "Change member variable in main";
        testScope(); 
                
    } // close main 
    
    
} // close class 
