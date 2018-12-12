/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classStructure;
import java.util.Scanner;

/**
 *
 * @author nermin.khalefa
 */

public class pointOfSale {
    public static int numSoccerTickets = 0;
    public static int numberSoccerShirts = 0;
    public static double totalRevenue = 0.0; 
    final static double PRICE_TICKETS = 5.00;
    final static double PRICE_SHIRTS = 10.00;
    
    public static void main (String[] args){
        System.out.println("Welcome to the soccer game!");
        int num = 2; 
         buySoccerTickets (num);
         buySoccerShirts (num);
         System.out.println("Enjoy the soccer game!"); 
         
    } // close main  
    public static void buySoccerTickets (int numSoccerTickets){
        Scanner scan = new Scanner (System.in);
        totalRevenue = totalRevenue + numSoccerTickets* PRICE_TICKETS;
        
    } // close tickets method 
    
    public static void buySoccerShirts (int numSoccerShirts) {
        Scanner scan = new Scanner (System.in);
        totalRevenue = totalRevenue + numSoccerShirts* PRICE_SHIRTS; 
    } // close shirts method 
    
    
} // close class 
