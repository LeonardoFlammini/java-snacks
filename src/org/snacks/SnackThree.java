package org.snacks;

import java.util.Arrays;
import java.util.Random;

public class SnackThree {
    public static void main(String[] args) {

        Random random = new Random();

        int n = 10,sum = 0;
        int[] array = new int[n];

        for (int i = 0 ; i < n; i++){
            array[i] = random.nextInt(0,100);
        }
        System.out.println("Array di 10 interi:");
        System.out.println(Arrays.toString(array));
        System.out.println("Somma dei numeri in posizione dispari:");

        for (int i = 0; i<array.length ; i+=2){
            sum += array[i];
        }

        System.out.println(sum);
    }
}
