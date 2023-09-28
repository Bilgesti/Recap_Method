package com.bilgee.Recap_method;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hey"); // Det är method som heter printline.
        test("Hello world");

        for ( int i = 0; i < 100; i++) {
            test("Index: " + i);
        }
        System.out.println(addition(2,8));

    }
    public static void test(String message) {
        System.out.println(message);
    }
    public static int addition (int x, int y){
        return x+y;
    }
}
