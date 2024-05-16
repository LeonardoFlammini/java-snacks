package org.snacks;

import java.util.Scanner;

public class SnackBonusSeven {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int secondiInput;


        System.out.println("Inserisci numero di secondi");
        secondiInput = Integer.parseInt(scanner.nextLine());

        int ore = secondiInput / 3600;
        int minuti = (secondiInput % 3600) / 60;
        int secondi = secondiInput % 60;

        System.out.print("hh:mm:ss--> ");
        System.out.printf("%02d:%02d:%02d",ore,minuti,secondi);

        scanner.close();
    }
}
