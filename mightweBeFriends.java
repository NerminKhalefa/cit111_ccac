package controlstructers;

import java.util.Scanner; 
        
/**
 * Implements logic for checking
 * dating compatability to practice
 * if statements 
 * @author nermin.khalefa
 */
public class mightweBeFriends {
    public static void main(String[] args){
        // builds a scanner objects and stores
        // in variable myScanner
        Scanner myScanner = new Scanner(System.in); 
        // read a line from the user and store in variable 
//        String userInput = myScanner.nextLine();
//        System.out.println("you Typed: " + userInput);
        
        int userinput =1;
        
        
        
        int likesPlayingSports;
        int earnedPoints = 0;
        int pointsPosible = 2000;
        // TODO: Replace hard-code with user input
        System.out.println("Welcome to dating picker!");
        System.out.println("Do you like playing sports? enter 1 for yes and 2 for no");
        likesPlayingSports = myScanner.nextInt();
        if(likesPlayingSports == 1){
            earnedPoints = earnedPoints + 100; 
            System.out.println("Excelent, me too");
            
        } else {
            earnedPoints = earnedPoints - 50;
            System.out.println(":(");
        } // close if/else chain
        // start age question 
        int age;
        System.out.println("What is your age?");
        age = myScanner.nextInt();
        if (age >= 18){ 
            System.out.println("Thats great news!");
        
        System.out.println("what is your gender? if female enter 2 if male enter 5!");
            int gender;
        gender =myScanner.nextInt();
            if (gender == 5) {
                System.out.println("excelent, lets get started!");
            }
            if (gender == 2) {
                System.out.println("Sorry not a same gender dating site");
            }
        System.out.println("Do you want kids? if yes enter one if no enter two");
            int kids;
        kids =myScanner.nextInt();
            if (kids == 1) {
                System.out.println("Awesome, me too!");
                earnedPoints = earnedPoints + 50;
               }else{
                System.out.println("thats too bad :(");
                earnedPoints = earnedPoints - 50;
                }//end if/else
            System.out.println("Do you smoke cigarittes? enter one for no and two for yes");
            int cigarittes;
            cigarittes =myScanner.nextInt();
            if (cigarittes == 1) {
                System.out.println("glad to heat that:)");
                earnedPoints = earnedPoints + 100;
            } else {
                earnedPoints = earnedPoints - 100;
                System.out.println("Cigarittes are bad for your health!");
            } // end if/else
            System.out.println("Do you have a college degree?");
            if (userinput == 1) {
                earnedPoints = earnedPoints + 200;
                System.out.println(" Thats good to know:)");
            } else {
                earnedPoints = earnedPoints - 150;
                System.out.println(":(");
            } // end if/else
            
            
        } else{ 
     
            System.out.println("sorry you are too young to use this app.");
        }
        
        System.out.println("Final point total" + earnedPoints );
        // if statement!!!!!! that compares earned points to whatever value i decide!!!
        // if arned points is greater then for example 300 sout a message 
    } // close main method 
} // close class

