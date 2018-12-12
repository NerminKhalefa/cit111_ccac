/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunck2methods;

/**
 * Illustrates the flow of values into methods
 * and their returned type-specified values to the calling
 * method.
 * @author Nermin.Khalefa
 */
import java.util.Scanner; 

public class GeometricShapes {
    public static void main(String [] args) {
        // create a scanner object to gather user input
        Scanner scanner = new Scanner(System.in); 
        // ************START SHAPE OF CYLINDER*****************
        // gather method parameters from the user and send to method for calculation
        System.out.println("Enter the cylinder radius: ");
        double userRadius = scanner.nextDouble();
        System.out.println("Enter the cylinder height:");
        double userHeight = scanner.nextDouble();
        // call calcVolumeOfCylinder() with user's radius and height
        double returnedCylinderVolume = calcVolumeOfCylinder(userRadius, userHeight);
        
        // print out our cylinder tools result
        System.out.println("The volume of a cylinder with radius: " + userRadius + " and height of "
                + userHeight +  " is " + returnedCylinderVolume);
        System.out.println("-----------------------------------------------");
        
        // **********START SHAPE OF CUBE ***********
        System.out.println("Enter the side Length of the cube here: ");
        double userSideLength = scanner.nextDouble();
        // call calcVolumeOfCube() with the user's side length as an argument
        double returnedVolume = calcVolumeOfCube(userSideLength);
        
        // print the input and the output to the console 
        System.out.println("Volume of a cube with side length " + userSideLength 
                + " is " +  returnedVolume);
        System.out.println("-------------------------------------------------");
        
        
        // ***********START SHAPE OF SPHERE *******************
       // gather method parameters from the user and send to method for calculations
        System.out.println("Enter radius of sphere here: ");
        double userRadiusOfSphere = scanner.nextDouble();
        // call calcVolumeOfSphere() with users radius 
        double returnedSphereVolume = CalcVolumeOfSphere(userRadiusOfSphere); 
        // print the input and the output to the console 
        System.out.println("Volume of a Shpere with radius: " + userRadiusOfSphere + " is " + returnedSphereVolume);
        System.out.println("--------------------------------------------------------------");

        
        
        
        
        
        
    } // end main
        
    public static double calcVolumeOfCube (double sideLength) {
    // implements the cube area formulas; side^3
    double cubevolume = Math.pow(sideLength, 3); 
    // return the area back to the calling method 
    return cubevolume;
        
} // close method
    
    public static double calcVolumeOfCylinder (double height, double radius) {
       // implements the Cylinder volume formulas; pie* r^2 * h
       final double PI =  3.1416;
       // implements the right cylinder formula; v= pi * r^2 * h
       double cylindervolume = PI * (radius * radius) * height;
       // return the volume back to calling method 
       return cylindervolume; 
               
    } // close method 
    
    public static double CalcVolumeOfSphere (double radius) {
        // implements the cylinder volume formulas; (4/3)(PI)(r^3)
        final double PI = 3.1416;
        final double number = 1.3333;
        // implements the right sphere formula; v= PI * (4/3) * (Radius^3)
        double sphereVolume = PI * (radius * radius * radius) * number; 
        // return the volume of sphere to calling method 
        return sphereVolume; 
        
    } // close main 
    
    
    
    
    
    
    
} // close class
