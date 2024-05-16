package org.snacks;

import java.util.Scanner;

public class SnackBonusSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero");
        String numeroStringa = scanner.nextLine();
        int risultato = 0;

        for (int i = 0; i < numeroStringa.length(); i++) {
            char c = numeroStringa.charAt(i);
            if (c >= '0' && c <= '9') {
                risultato = risultato * 10 + (c - '0');
            } else {
                // Gestisci il caso in cui il carattere non sia un numero
                System.out.println("La stringa contiene caratteri non numerici.");
                return;
            }
        }

        System.out.println("Il numero intero è: " + risultato);


    }
}
