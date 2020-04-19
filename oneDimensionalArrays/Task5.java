package _2Algorithmization.arrays;

/*
    Даны целые числа a1, a2, ..., aN. Вывести на печать только те числа, для которых ai > i.
 */

import myLibrary.RandomArray;

public class _5Task {

    public static void main(String[] args) {

        int n = 10; // размер массива

        int[] arr;
        arr = RandomArray.newInt(n, true);
        System.out.print("New array:");
        RandomArray.showArray(arr);

        System.out.print("\nArray with arr[i] > i:");
        for (int i = 0; i < n; i++){
            if (arr[i] > i) {
                System.out.print(" " + arr[i]);
            }
        }

    }

}
