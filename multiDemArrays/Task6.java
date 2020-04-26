package _2Algorithmization.multiArrays;

/*
Сформировать квадратную матрицу порядка N по заданному образцу (n - четное):

  1 1 1 ... 1 1 1
  0 1 1 ... 1 1 0
  . . . ... . . .
  0 1 1 ... 1 1 0
  1 1 1 ... 1 1 1

 */

import myLibrary.RandomArray;

public class Task6 {

    public static void main(String[] args) {

        int n = 10;
        int x = 0;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ((j >= i) && (j < arr.length - i) && (x < n/2)){
                    arr[i][j] = 1;
                }
                else if ((j <= i) && (j >= arr[i].length - 1 - i)){
                    arr[i][j] = 1;
                }
                else arr[i][j] = 0;
            }
            x++;
        }

        for (int[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

    }

}
