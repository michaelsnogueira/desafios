package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.


        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}