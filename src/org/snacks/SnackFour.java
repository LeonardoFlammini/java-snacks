package org.snacks;

import java.util.Scanner;

public class SnackFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola:");
        String original = scanner.nextLine();
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.compareTo(reversed) == 0){
            System.out.println("Palindroma");
        }else {
            System.out.println("Non Palindroma");
        }

        scanner.close();

    }
}
