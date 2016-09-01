package com.example.helloworld;

/**
 * Created by Damian on 8/28/2016.
 */
public class HelloWorld {

    public static void main(String[] args) {
        printLine("Hello, World!");
        System.out.println("Your request has been printed.");
    }

    private static void printLine(String s) {
        System.out.println(s);
    }
}