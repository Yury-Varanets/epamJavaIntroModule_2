package _2Algorithmization.multiArrays;

/*
Сформировать случайную матрицу m*n, состоящую из нулей и единиц,
причем в каждом столбце число единиц раавно номеру столбца.
 */

import myLibrary.RandomArray;

public class Task14 {

    public static void main(String[] args) {

        int m = 10;
        int n = 8;
        int[][] arr = new int[m][n];
        int num;
        int count;

        for(int i = 0; i < n; i++){
            do {
                count = 0;
                for (int j = 0; j < m; j++) {
                    num = (int) (Math.random() * 10) % 2;
                    if(num == 1) {
                        count++;
                    }
                    arr[j][i] = num;
                }
            }while(count != i);
        }

        for (int[] a: arr){
            RandomArray.showArray(a);
            System.out.println();
        }

    }

}
