package com.company;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First double var: ");
        double var1 = scanner.nextDouble();
        System.out.println("Second double var: ");
        double var2 = scanner.nextDouble();

        System.out.println("Aritmeticke operacije: " + "\n");
        double multiplication = var1 * var2;
        double division = var1 / var2;
        double modulo = var1 % var2;
        double addition = var1 + var2;
        double subtraction = var1 - var2;

        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);

        System.out.println("Najveci rezultat je: " + Math.max(Math.max(Math.max(multiplication, division), Math.max(modulo, addition)), subtraction));

        System.out.println("What is your name? ");
        String name = scanner.next();
        int stringLength = name.length();
        System.out.println("Length of name is: " + stringLength);
        Math.sqrt(name.length());
        System.out.println("Square root of name's length is: " + Math.sqrt(name.length()));

        System.out.println("Input one long variable: ");
        long VarL = scanner.nextLong();
        String longTostring= valueOf(VarL);
        System.out.println("Long is: " +VarL);
        System.out.println("String's length is: " + longTostring.length());
    }








    }

