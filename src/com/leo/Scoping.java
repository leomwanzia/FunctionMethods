package com.leo;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
