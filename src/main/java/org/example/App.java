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
        int numFirstInt = Integer.parseInt(numFirstString);
        int numSecondInt = Integer.parseInt(numSecondString);

        int numAdd = numFirstInt + numSecondInt;
        int numSubtract = numFirstInt - numSecondInt;
        int numMultiply = numFirstInt * numSecondInt;
        int numDivide = numFirstInt / numSecondInt;

        //output
        System.out.println(String.format("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d", numFirstInt ,numSecondInt, numAdd, numFirstInt, numSecondInt, numSubtract, numFirstInt, numSecondInt, numMultiply, numFirstInt, numSecondInt, numDivide));
    }
}
