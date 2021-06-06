/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class tax {
    public static void wisconsin(double amount) {
        double tax = 5.5 * amount / 100;
        System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.", amount, tax, amount + tax);
    }
}
