package _2Algorithmization.multiArrays;

/*
Найдите наибольший элемент матрицы и замените все нечетные элементы на него.
 */

import myLibrary.RandomArray;

public class Task15 {

    public static void main(String[] args) {

        int n = 10;
        int[][] arr = new int[n][];
        int max;

        for (int i = 0; i < n; i++){
            arr[i] = RandomArray.newInt(n, false);
        }

        for (int[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

        //поиск наибольшего элемента
        max = arr[0][0];
        for (int[] num: arr){
            for (int j = 0; j < num.length; j++){
                if(num[j] > max){
                    max = num[j];
                }
            }
        }

        //замена нечетных элементов на наибольший
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 != 0){
                   arr[i][j] = max;
                }
            }
        }

        System.out.println("after change");
        for (int[] num: arr){
            RandomArray.showArray(num);
            System.out.println();
        }

    }

}
