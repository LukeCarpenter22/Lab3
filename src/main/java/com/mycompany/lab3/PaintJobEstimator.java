/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Scanner;




/**
 *
 * @author lukec
 */
public class PaintJobEstimator {
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);       
 
    //get number of rooms
    System.out.println("Enter number of rooms");
        double numberOfRooms = keyboard.nextDouble();
    
    //get paint price per gallon
    System.out.println("Enter price of one gallon of paint");
        double pricePerGallon = keyboard.nextDouble();
    
    //get square footage per room
    double totalFootage = 0;
    for(int i = 1; i <= numberOfRooms; i++) {
       System.out.println("What is the square footage in room " + i);
       double footage = keyboard.nextDouble();
       totalFootage = totalFootage + footage;
    }
    //number of gallons of paint required
    double gallonsPaintRequired;
    gallonsPaintRequired = totalFootage / 115;
    System.out.println("The number of gallons of paint needed is " + gallonsPaintRequired + " gallons.");
    //hours of labor required
    double laborRequired;
    laborRequired = (totalFootage / 115) * 8;
    System.out.println("The amount of hours of labor that will be required is " + laborRequired);
    //cost of the paint
    double costOfPaint;
    costOfPaint = gallonsPaintRequired * pricePerGallon;
    System.out.println("The cost of the paint is " + costOfPaint + " dollars.");
    //labor charges
    double laborCharges;
    laborCharges = laborRequired * 18;
    System.out.println("The total cost for labor is " + laborCharges + " dollars.");
            
    //total cost of the paint job
    double totalCost;
    totalCost = laborCharges + costOfPaint;
    System.out.println("The total cost for this job is " + totalCost + " dollars.");
    }
    
    
         
         
    
}
