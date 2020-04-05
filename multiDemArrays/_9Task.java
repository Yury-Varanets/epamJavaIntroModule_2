package _2Algorithmization.multiArrays;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */

public class _9Task {

    public static void main(String[] args) {

        // размер матрицы
        int n = 3;
        int m = 5;

        int maxSum = 0; //значение максимальноый суммы столбца
        int pos = 0; // позиция maxSum

        int[][] mat = new int[n][m]; // стартовая матрица
        int[] sum = new int[m]; // хранение сумм значений элементов каждого столбца

        System.out.println("new mat");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mat[i][j] = (int)(Math.random() * 10);
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }

        System.out.println("Sum: ");
        for (int i = 0; i < m; i++){
            sum[i] = 0;
            for (int j = 0; j < n; j++){
                sum[i] += mat[j][i];
            }
            System.out.print(" " + sum[i]);
            if ( sum[i] > maxSum ){
                maxSum = sum[i];
                pos = i;
            }
        }
        System.out.println("\nМаксимальная сумма элементов а матрице - столбец №" + pos + ", sum = " + sum[pos] + "." );

    }

}
