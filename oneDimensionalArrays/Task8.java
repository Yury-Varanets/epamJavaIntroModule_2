package _2Algorithmization.arrays;

/*
Дана последовательность целых чисел a1, a2, ..., aN. Образовать новую последовательность,
выбросив из исходной те члены, которые равны min(a1, a2, ..., aN).
 */

public class _8Task {

    public static void main(String[] args) {

        int n = 10; // размер массива
        int min;
        int[] newArr;
        int count = 0;

        // объявление и инициализация массива
        System.out.print("origin arr: ");
        int[] arr = new  int[n];
        for (int i = 0; i < n; i++){
            arr[i] = (int)(Math.random() * 10) - (int)(Math.random() * 10);
            System.out.print(" " + arr[i]);
        }

        min = arr[0];
        for (int i = 1; i < n ; i++){
            if (arr[i] < min) min = arr[i];
        }
        for (int num: arr){
            if (num == min) count++;
        }

        System.out.print("\nnew array:");
        int j = -1;
        newArr = new int[n - count];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != min) {
                j++;
                newArr[j] = arr[i];
                System.out.print(" " + newArr[j]);
            }
        }

    }

}
