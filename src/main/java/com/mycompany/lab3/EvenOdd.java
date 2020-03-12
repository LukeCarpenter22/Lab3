/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Random;

/**
 *
 * @author lukec
 */
public class EvenOdd {
    public static boolean isEven( int number) {
        if  ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;
        
        for (int currentNumber =1; currentNumber <=100; currentNumber++) {
            randomNumber = random.nextInt( 100 ) + 1;
            if( isEven(randomNumber)) {
                numberOfEvenNumbers = numberOfEvenNumbers + 1;
            } else {
                numberOfOddNumbers = numberOfOddNumbers + 1;
            }
        }
        System.out.println("There were " + numberOfEvenNumbers + " even numbers and " + numberOfOddNumbers + " odd numbers");
         
    }
}
