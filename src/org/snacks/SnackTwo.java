package org.snacks;

import java.util.Arrays;
import java.util.Random;

public class SnackTwo {
    public static void main(String[] args) {
        Random random = new Random();

        String[] nomi = {
                "Marco", "Giulia", "Luca", "Sofia", "Matteo",
                "Alessia", "Giovanni", "Chiara", "Francesco", "Martina"
        };

        String[] cognomi = {
                "Rossi", "Ferrari", "Russo", "Bianchi", "Romano",
                "Gallo", "Costa", "Fontana", "Conti", "Esposito"
        };

        int n = 10;

        String[] invitati = new String[n];

        for( int i = 0; i<n; i ++){
            int randA = random.nextInt(0 ,9);
            int randB = random.nextInt(0 ,9);
            invitati[i] = nomi[randA] + " " + cognomi[randB];
        }

        System.out.println(Arrays.toString(invitati));
    }
}
