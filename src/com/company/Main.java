package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite pet brojeva vrijednosti do 10: ");
        int broj1 = scanner.nextInt();
        int broj2 = scanner.nextInt();
        scanner.nextLine();
        int broj3 = scanner.nextInt();
        int broj4 = scanner.nextInt();
        scanner.nextLine();
        int broj5 = scanner.nextInt();

        int zbir = (int) (broj1 + broj2 + broj3 + broj4 + broj5);
        double prosjek = (double) (zbir / 5);
        System.out.println("Prosjek je: " + prosjek);

        if (prosjek <= 5) {
            System.out.println("Niste polozili. Potrudite se vise.");
        } else if (prosjek >= 6 && prosjek < 7) {
            System.out.println("Polozili ste, ali mozete i bolje.");
        } else if (prosjek >= 7 && prosjek < 8) {
            System.out.println("Polozili ste!");
        } else if (prosjek >= 8 && prosjek < 9) {
            System.out.println("Polozili ste! Vas trud se vidi!");
        } else if (prosjek >= 9 && prosjek < 10) {
            System.out.println("Polozili ste! Zadovoljna sam vasim napretkom!");
        } else {
            System.out.println("Polozili ste! Vas trud je odusevljavajuci!");


        }

        scanner.nextLine();

        System.out.println("Koja boja vam je draza? Ljubicasta ili roza?");
        String boja = scanner.next();
        String slovo = String.valueOf(boja.charAt(0));

        String KorisnikovOdabir = slovo.equals("L") || slovo.equals("l") ? "Odabrali ste ljubicastu." : "Odabrali ste roza.";
        System.out.println(KorisnikovOdabir);
    }
}
