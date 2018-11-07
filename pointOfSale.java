package classStructure;
import java.util.Scanner;

/**
 *
 * @author nermin.khalefa
 */

public class pointOfSale {
    public static int numSoccerTickets = 0;
    public static int numSoccerShirts = 0;
    public static double totalRevenue = 0.0; 
    final static double PRICE_TICKETS = 5.00;
    final static double PRICE_SHIRTS = 10.00;
    
    public static void main (String[] args){
        System.out.println("Welcome to the soccer game!");
        int num = 8; 
        int pri = 5;
         
         buySoccerTickets (num);
         buySoccerShirts (pri);
         System.out.println("Enjoy the soccer game!"); 
         
    } // close main  
    public static void buySoccerTickets (int numSoccerTickets){
        Scanner scan = new Scanner (System.in);
        System.out.println("Buy Soccer Tickets here!!! ");
        totalRevenue = totalRevenue + numSoccerTickets* PRICE_TICKETS;
        
    } // close tickets method 
    
    public static void buySoccerShirts (int numSoccerShirts) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Buy Soccer Shirts here!!! ");
        totalRevenue = totalRevenue + numSoccerShirts* PRICE_SHIRTS; 
    } // close shirts method 
    
    public static void displayTotalRevenue() {
        Scanner scan = new Scanner (System.in);
        System.out.println("********************* TOTAL REVENUE ********************** ");
        System.out.println(" REVENUE Soccer shirts: " + numSoccerShirts );
        System.out.println("REVENUE Soccer Rickets: " + numSoccerTickets );
        System.out.println("TOTAL REVENUE: " + totalRevenue );
        System.out.println("********************************");
    } // close displaytotalrevenue
    
    
} // close class 

