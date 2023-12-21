package org.example;

import java.util.Scanner;


//The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
//
//Hint: Java's Scanner.hasNext() method is helpful for this problem.
public class Main {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(sc.hasNext())
        {
            System.out.println(++i +" "+ sc.nextLine());
        }

    }
}