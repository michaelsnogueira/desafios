package org.example;

import java.util.Scanner;

//
//Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
//
//It's time to test your knowledge of Static initialization blocks. You can read about it here.
//
//You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.
//
//        If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
public class Main {
    private static int largura, altura;
    private static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        largura = sc.nextInt();
        altura = sc.nextInt();
        flag = largura > 0 && altura > 0;
    }
    public static void main(String[] argh) {

        if (flag) {
            System.out.println(largura * altura);
        } else
            System.out.println("java.lang.Exception: Breadth and height must be positive");

    }
}