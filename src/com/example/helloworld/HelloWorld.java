package com.example.helloworld;

/**
 * Created by Damian on 8/28/2016.
 */

import java.io.Console;

public class HelloWorld {

    public static void main(String[] args) {

        Console c = System.console();

        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        String name = c.readLine("Enter your name: ");

        printLine("Hello, " + name + "!"); 
        System.out.println("Your request has been printed.");
    }

    private static void printLine(String s) {
        System.out.println(s);
    }
}