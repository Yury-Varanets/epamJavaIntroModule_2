package _2Algorithmization.multiArrays;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
     1   1   1  ...  1   1   1
     2   2   2  ...  2   2   0
     3   3   3  ...  3   0   0
    ... ... ... ... ... ... ...
    n-1 n-1  0  ...  0   0   0
     n   0   0  ...  0   0   0
 */

import myLibrary.RandomArray;

public class Task5 {

    public static void main(String[] args){

        int n = 8;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i + j < n){
                    arr[i][j] = i + 1;
                }
                else arr[i][j] = 0;
            }
        }

        for (int[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

    }

}
