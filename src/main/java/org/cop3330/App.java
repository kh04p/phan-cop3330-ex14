/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();
        input.nextLine(); //consume newline character
        System.out.print("What is the state? ");
        String state = input.nextLine().toLowerCase().trim();
        switch (state) {
            case "wi": //same outcome when typing "wi" or "wisconsin"
            case "wisconsin":
                tax.wisconsin(amount);
                break;
            default:
                System.out.printf("The total is $%.2f.", amount);
                break;
        }
    }
}
