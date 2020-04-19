package _2Algorithmization.arrays;

/*
В массиве целых чисел с количеством элементов N найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */

public class _9Task {

    public static void main(String[] args) {

        int n = 10;
        int num;
        int max;
        int pos = 0;
        int min;


        // объявление и инициализация массива
        System.out.print("origin arr: ");
        int[] arr = new  int[n];
        int[] cArr = new int[arr.length]; // счетчик совпадений
        for (int i = 0; i < n; i++){
            arr[i] = (int)(Math.random() * 10) - (int)(Math.random() * 10);
            cArr[i] = 0;
            System.out.print(" " + arr[i]);
        }


        for (int i = 0; i < arr.length; i++){
            num = arr[i];
            for (int j = 0; j < arr.length; j++){
                if (num == arr[j]) {
                    cArr[i]++;
                }
            }
        }

        max = cArr[0];
        for (int i = 1; i < arr.length; i++){
            if (cArr[i] > max) {
                pos = i;
                max = cArr[i];
            }
        }

        min = arr[pos];
        for (int i = 0; i < arr.length; i++){
          if (cArr[i] == max){
              if (arr[i] < min){
                  min = arr[i];
              }
          }
        }

        System.out.println("\nНаиболее часто встречающееся число (наименьшее) -> " + min);

    }

}
