package com.leo;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Leo Mwanzia"; // you cannot modify a string
        changeName(name);
        System.out.println(name);
    }
    static void changeName (String jina) {
        jina = "Leo Simba"; // creating a new object
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
