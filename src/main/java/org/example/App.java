/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");
        String numFirstString = input.nextLine();

        System.out.println("What is the second number?");
        String numSecondString = input.nextLine();

        //conversions and processing
        double numFirstInt = Double.parseDouble(numFirstString);
        double numSecondInt = Double.parseDouble(numSecondString);

        double numAdd = numFirstInt + numSecondInt;
        double numSubtract = numFirstInt - numSecondInt;
        double numMultiply = numFirstInt * numSecondInt;
        double numDivide = numFirstInt / numSecondInt;

        //output
        System.out.println(String.format("%.2f + %.2f = %.2f \n%.2f - %.2f = %.2f \n%.2f * %.2f = %.2f \n%.2f / %.2f = %.2f", numFirstInt ,numSecondInt, numAdd, numFirstInt, numSecondInt, numSubtract, numFirstInt, numSecondInt, numMultiply, numFirstInt, numSecondInt, numDivide));
    }
}
