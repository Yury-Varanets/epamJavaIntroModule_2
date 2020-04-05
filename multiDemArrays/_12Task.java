package _2Algorithmization.multiArrays;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class _12Task {

    public static void main(String[] args) {

        int n = 20;
        int m = 10;

        int[][] mat = new int[n][m];
        boolean st;
        int temp;

        System.out.println("\tnew mat 10*20");
        for (int i = 0; i < n; i++){
            System.out.printf("%2d: ", i);
            for (int j = 0; j < m; j++){
                mat[i][j] = (int)(Math.random() * 16);
                System.out.printf("%4d ",mat[i][j] );
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){
            do {
                st = false;
                for (int j = 1; j < m; j++){
                    if (mat[i][j - 1] > mat[i][j]){
                        temp = mat[i][j - 1];
                        mat[i][j - 1] = mat[i][j];
                        mat[i][j] = temp;
                        st = true;
                    }
                }
            }while (st);
        }

        System.out.println("\tsorted up mat 10*20");
        for (int i = 0; i < n; i++){
            System.out.printf("%2d: ", i);
            for (int j = 0; j < m; j++){
                System.out.printf("%4d ",mat[i][j] );
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){
            do {
                st = false;
                for (int j = 1; j < m; j++){
                    if (mat[i][j - 1] < mat[i][j]){
                        temp = mat[i][j - 1];
                        mat[i][j - 1] = mat[i][j];
                        mat[i][j] = temp;
                        st = true;
                    }
                }
            }while (st);
        }

        System.out.println("\tsorted down mat 10*20");
        for (int i = 0; i < n; i++){
            System.out.printf("%2d: ", i);
            for (int j = 0; j < m; j++){
                System.out.printf("%4d ",mat[i][j] );
            }
            System.out.println();
        }

    }

}
