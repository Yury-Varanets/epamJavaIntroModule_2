package _2Algorithmization.multiArrays;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */

import myLibrary.RandomArray;

public class Task10 {

    public static void main(String[] args) {

        int n = 10;
        int[][] arr = new int[n][];

        for (int i = 0; i < n; i++){
            arr[i] = RandomArray.newInt(n, true);
        }

        for (int[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

        System.out.print("Положительные элементы: ");
        for (int i = 0; i < arr.length; i++){
            if(arr[i][i] > 0 ){
                System.out.printf("%3d", arr[i][i]);
            }
        }

    }

}
