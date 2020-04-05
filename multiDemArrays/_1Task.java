package _2Algorithmization.multiArrays;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class _1Task {

    public static void main(String[] args) {

        int n = 5; // размер массива
        int m = 5; // размер массива

        // объявление и инициализация массива
        int[][] arr = new  int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = (int)(Math.random() * 10) - (int)(Math.random() * 10);
                System.out.print("   " + arr[i][j]);
            }
            System.out.println();
        }

        int[] pos = new int[n];
        for (int i = 0; i < pos.length; i++){
            pos[i] = 0;
        }

        for (int j = 0; j < m; j ++){
            if ( (j + 1) % 2 != 0 ){
                if (arr[0][j] > arr[n -1][j]){
                    pos[j] = 1;
                }
            }
        }

        System.out.println("new array");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < pos.length; j++){
                if (pos[j] == 1){
                    System.out.print("   " + arr[i][j]);
                }
            }
            System.out.println();
        }

    }

}
