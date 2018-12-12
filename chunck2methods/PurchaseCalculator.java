/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunck2methods;

/**
 *
 * @author nermin.khalefa
 */
public class PurchaseCalculator {
    public static void main(String[] args){
        // we would ordinarily declate this constant in class scope
        // stay- tuned for next week's module
        final double ITEAM_PRICE = 100.00;
        System.out.println("Hard- coded price value: $" + ITEAM_PRICE);
         
        // call method and pass in a double value as the declartion requires 
        displayPriceWithTax(ITEAM_PRICE); 
        
    } // close method main 
 /**
  * Computes and displays the inputted price with the tax rate added
  * @param price the initial purchase price
  */   
    public static void displayPriceWithTax(double price){
        // this would normally be in class scope (not inside any method)
        final double TAX_RATE = 0.075;
        // compute price + tax
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice );
    } // close method displayPriceWithTax
    
}
