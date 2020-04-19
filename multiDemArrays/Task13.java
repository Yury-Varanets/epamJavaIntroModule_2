package _2Algorithmization.multiArrays;

/*
Отсортировать столбцы матрицы провозростанию и убыванию значений элементов.
 */

import myLibrary.RandomArray;

public class Task13 {

    public static void main(String[] args) {

        //рамер матрицы
        int n = 5;
        int m = 10;
        int count = 0;
        int temp;

        int[][] arr = new int[n][];

        for (int i = 0; i < arr.length; i++){
            arr[i] = RandomArray.newInt(m, false);
        }

        for (int[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

        for (int j = 0; j < m; j++){
            //temp = arr[0][j];
            do {
                count = 0;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1][j] > arr[i][j]) {
                        temp = arr[i - 1][j];
                        arr[i - 1][j] = arr[i][j];
                        arr[i][j] = temp;
                        count++;
                    }
                }
            }while(count != 0);
        }

        System.out.println("\nafter up sorting");
        for (int[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

        for (int j = 0; j < m; j++){
            do {
                count = 0;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1][j] < arr[i][j]) {
                        temp = arr[i - 1][j];
                        arr[i - 1][j] = arr[i][j];
                        arr[i][j] = temp;
                        count++;
                    }
                }
            }while(count != 0);
        }

        System.out.println("\nafter down sorting");
        for (int[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

    }

}
