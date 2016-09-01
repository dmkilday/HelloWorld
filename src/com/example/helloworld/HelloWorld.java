package com.example.helloworld;

/**
 * Created by Damian on 8/28/2016.
 * Example taken from http://alvinalexander.com/java/edu/pj/pj010005 on 9/1/2016
 */

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //  ask for the user's name
        System.out.print("Enter your name: ");

        // get their input as a String
        String name = scanner.next();

        System.out.println("Hello, " + name + "!");
    }
}