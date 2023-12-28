package org.example;

import java.util.Scanner;

//You are given an integer , you have to convert it into a string.
//Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
//can range between  to  inclusive.
public class Main {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            String.valueOf(n);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }

    }
}