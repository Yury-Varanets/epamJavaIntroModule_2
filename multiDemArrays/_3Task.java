package _2Algorithmization.multiArrays;

/*
Дана матрица. Вывести k-ю строку и р-й столбец матрицы.
 */

import java.util.Scanner;

public class _3Task {

    public static void main(String[] args) {

        int n = 5;
        int k; //строка
        int p; //столбец

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = (int)(Math.random() *10);
                System.out.print("  " + mat[i][j]);
            }
            System.out.println();
        }

        System.out.println("!!!Нумерация строк и столбцов начинается с 0");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите № строки: ");
        k = scanner.nextInt();
        System.out.print("Введите № столбца: ");
        p = scanner.nextInt();

        System.out.print("Строка № " + k +": ");
        for (int i = 0; i < n; i++){
            System.out.print(" " + mat[k][i]);
        }

        System.out.print("\nСтолбец № " + p +": \n");
        for (int i = 0; i < n; i++){
            System.out.println(" " + mat[i][p]);
        }
    }

}
