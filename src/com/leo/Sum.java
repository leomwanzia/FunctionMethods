package com.leo;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    //return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
         /*

        access modifier (OOP) return_type () {
        // body
        return statement;

         */
}
