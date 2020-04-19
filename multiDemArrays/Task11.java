package _2Algorithmization.multiArrays;

/*
Матрицу 10х20 заполнить случайными числами от 0 до 15. ывести на экран саму матрицу
и номера строк, в которых число 5 встречается три и более раз.
 */

public class _11Task {

    public static void main(String[] args) {

        int n = 20;
        int m = 10;

        int[][] mat = new int[n][m];
        int num = 5;
        int count = 0;
        boolean st = false;

        System.out.println("new mat 10*20");
        for (int i = 0; i < n; i++){
            System.out.printf("%2d: ", i);
            for (int j = 0; j < m; j++){
                mat[i][j] = (int)(Math.random() * 16);
                System.out.printf("%4d ",mat[i][j] );
            }
            System.out.println();
        }

        System.out.print("строки с числом 5 (3 и более раз):");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (mat[i][j] == num){
                    count++;
                }
            }
            if (count >= 3){
                System.out.print(i + " ");
                st = true;
            }
            count = 0;
        }
        if (!st) System.out.println("no matches");

    }

}
