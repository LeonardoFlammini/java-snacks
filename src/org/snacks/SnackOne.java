package org.snacks;

import java.util.Scanner;

public class SnackOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Inserisci un numero: ");
        n = Integer.parseInt(scanner.nextLine());

        if ( n % 2 == 0){
            System.out.printf("il numero %d e' pari", n);
        }else {
            System.out.printf("il numero %d e' dispari il successivo e': %d", n, n+1);
        }
        scanner.close();
    }
}
