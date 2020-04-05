package _2Algorithmization.arrays;

/*
    Дана последовательность действительных чисел а1, а2, ..., аN.
    Заменить все ее членый, большие данного Z, этим числом.
    Подсчитать количество замен.
 */


import myLibrary.RandomArray;

import java.util.Scanner;

public class _2Task {

    public static void main(String[] args) {

        //int n = 10; // размер массива

        // объявление и инициализация массива
        double[] arr;
        int count = 0; // счетчик замен

        arr = RandomArray.newDouble(10, false);
        System.out.print("new array: ");
        for (double num: arr){
            System.out.printf("%.2f ", num);
        }

        // ввод сравниваемого числа - Z
        System.out.print("\nВведите число Z = ");
        Scanner scanner = new Scanner(System.in);
        double z = scanner.nextDouble();
        System.out.println("z = " + z);

        System.out.print("after changed: ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
            System.out.printf("%.2f ", arr[i]);
        }

        System.out.println("\nКоличество замен: " + count);

    }

}
