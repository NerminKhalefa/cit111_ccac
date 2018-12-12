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

public class Authentication {

    public static void main(String[] args) {
        // declare variables for controling number of attempts 
        String correctPassword = "Pizza";
        int numberOfAttempts = 0;
        int maxNumberOfAttempts = 5;
        String userInput;
        // create a scanner and store it in variable of our choice 
        Scanner scanner = new Scanner(System.in);

        // prompt user and get an int from them
        System.out.println("*** Authenitcator Revisited ***");
        //  grab an int from the user and store it
        while (numberOfAttempts <= maxNumberOfAttempts) {
            System.out.println("Enter the system password to learn the protected information");
            userInput = scanner.next();

            // comment 
            if (userInput.equals(correctPassword)) {
                System.out.println("Congrats, the password you have entered is correct!!!");
            } else {
                System.out.println("The password you have entered is incorrect, only 4 attempts left");
            }// close else statement
            System.out.println("the number of attempts: " + numberOfAttempts);

            numberOfAttempts = numberOfAttempts + 1;

        } // close while 
    } // close main 
} // close class 
