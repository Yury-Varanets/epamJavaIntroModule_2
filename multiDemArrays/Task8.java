package _2Algorithmization.multiArrays;

/*
В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца
поставить на соответствующие им позиции дркгого, а его элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.
 */

import java.util.Scanner;

public class _8Task {

    public static void main(String[] args) {

        // размер матрицы
        int n = 3;
        int m = 5;

        int[][] mat = new int[n][m]; // стартовая матрица
        int temp; // временно храниние значения столбца в стартовой матрицы для замены

        Scanner scan = new Scanner(System.in);
        //номера столбцов для замены друг друга
        int pos1;
        int pos2;

        System.out.println("new mat");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mat[i][j] = (int)(Math.random() * 10);
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }

        do {
            System.out.println("Введите номера двух столбцов для взаимозамены (нумерация от 0 до " + (m - 1) + ").");
            System.out.print("1-ый: ");
            pos1 = scan.nextInt();
            System.out.print("2-ый: ");
            pos2 = scan.nextInt();
        } while ((pos1 < 0) || (pos2 >= m));

        for (int i = 0; i < n; i++){
           temp = mat[i][pos1];
            mat[i][pos1] = mat[i][pos2];
            mat[i][pos2] = temp;
        }

        System.out.println("after change");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }

    }

}
