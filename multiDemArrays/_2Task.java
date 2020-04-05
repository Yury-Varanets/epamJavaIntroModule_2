package _2Algorithmization.multiArrays;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class _2Task {

    public static void main(String[] args) {

        int n = 5;

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = (int)(Math.random() *10);
                System.out.print("  " + mat[i][j]);
            }
            System.out.println();
        }

        System.out.println("elements form diagonal");
        for (int i = 0; i < n; i++){
            if (i == (mat.length -1 -i)){
                System.out.print(" " + mat[i][i]);
            }else {
                System.out.print(" " + mat[i][i] + " " + mat[i][mat.length - 1 - i]);
            }
        }

    }

}
