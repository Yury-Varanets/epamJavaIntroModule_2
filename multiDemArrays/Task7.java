package _2Algorithmization.multiArrays;

/*
Сформировать квадраттную матрицу порядка N по правилу:
            I^2 - J^2
A[I,J]=sin( --------- );
                N
и подсчитать вколичество положительных элементов в ней.
 */

import myLibrary.RandomArray;

public class Task7 {

    public static void main(String[] args) {

        int n = 7;
        double a;
        double[][] arr = new double[n][n];
        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a = Math.sin( (Math.pow(i, 2) - Math.pow(j, 2)) / n);
                arr[i][j] = a;
                if (arr[i][j] > 0 ) count++;
            }
        }

        for (double[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

        System.out.println("\nПоложительных элементов - " + count + ".");

    }

}
