/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String password= "abc$123", attempt;

        System.out.print("What is the password? " );
        attempt = input.next();

        if(attempt.compareTo(password) == 0) {
            System.out.print("Welcome!");
        }
        else {
            System.out.print("I don't know you.");
        }
    }
}
