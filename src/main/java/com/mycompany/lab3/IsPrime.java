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
public class IsPrime {
    public static boolean isPrime(int num) {
        int count = 0;
        for (int i =2; i<=num/2; i++) 
        {
            if (num%i==0)
                count++;
        }
        if (count>0)
            return false;
        else
            return true;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = keyboard.nextInt();
        
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number");
        }
            
            
                
        
        
        
                
    }
}
