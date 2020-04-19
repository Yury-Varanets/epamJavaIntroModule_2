package _2Algorithmization.arrays;

/*
В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

import myLibrary.RandomArray;

import java.util.Scanner;

public class _1Task {

    public static void main(String[] args) {

        int[] arrays;
        int k;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        arrays = RandomArray.newInt(10, true);


        System.out.print("\nВведите число К = ");
        k = scanner.nextInt();

        for (int i = 0; i < arrays.length; i++){
            System.out.print(" " + arrays[i]);
        }

        for (int i = 0; i < arrays.length; i++){
            if (arrays[i] == 0) sum += arrays[i];
            else if (k % arrays[i] == 0) sum += arrays[i];
        }
        System.out.println("\nSum = " + sum);

    }

}
