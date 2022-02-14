package com.company;

public class Main {

    public static void main(String[] args) {

        double a = 1.2;
        System.out.println("Vrijednost a varijable: " + a);
        System.out.println("Zaokruzena vrijednost: " + Math.ceil(a));

        int b = (int)(Math.random()*99+1);
        int c = (int)(Math.random()*99+1);
        int d = (int)(Math.random()*99+1);
        System.out.println("Random vrijednost varijable b: " + b);
        System.out.println("Random vrijednost varijable c: " + c);
        System.out.println("Random vrijednost varijable d: " + d);

        int min = Math.min(Math.min(b, c),d);
        int max = Math.max(Math.max(b, c), d);
        System.out.println("Najmanja vrijednost varijable: " + min);
        System.out.println("Najveca vrijednost varijable: " + max);

        System.out.println("Kvadrat najmanje varijable: " + Math.pow(min, 2));
        System.out.println("Kvadrat najvece varijable: " + Math.pow(max, 2));





    }
}