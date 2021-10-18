package com.riadsafowan.cse215.java;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        //1. Write a program that prints your name, age and department in console.
        System.out.println("Name: Riad Safowan\n" +
                "Age: 21\n" +
                "Department: ECE");

        //2. Write a program that prints from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //3. Write a program that determines if an integer is odd or even.
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if (inputNum % 2 == 0) {
            System.out.println(inputNum + " is even number");
        } else {
            System.out.println(inputNum + " is odd number");
        }
    }
}
