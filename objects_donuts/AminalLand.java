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
public class AminalLand {
   public static void main (String[] args){
       Animal a = new Animal();
       a.species = "FairyBear";
       a.age = "15 yaers";
       a.color = "White";
       a.movments = "Fly";
       
       // prove that we can have 
       // 2 pointers to the same animal object 
       Animal aSame;
       // copy the reference to the object
       // b piont to aSame
       aSame = a; 
       System.out.println(a.movments + " is the kind of movment they can do ");
       System.out.println(a.species + " is Species of animal");
       System.out.println(a.color + " is the color of the species ");
       System.out.println("*******************************" );

       System.out.println(aSame.movments + " is the kind of movment they can do" );
       System.out.println(aSame.color + " is the color of the species ");
       System.out.println(a.species + " is Species of animal ");
       
   } // close method 
} // close class 
