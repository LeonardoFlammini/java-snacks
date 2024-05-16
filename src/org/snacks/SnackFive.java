package org.snacks;

import java.util.Scanner;

public class SnackFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int alfabetici = 0, numeri = 0, simboli = 0;


        System.out.print("Inserisci una stringa: ");
        input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alfabetici++;
            } else if (Character.isDigit(c)) {
                numeri++;
            } else {
                simboli++;
            }
        }


        System.out.println("Caratteri alfabetici: " + alfabetici);
        System.out.println("Numeri: " + numeri);
        System.out.println("Simboli non alfanumerici: " + simboli);


        scanner.close();
    }
}
