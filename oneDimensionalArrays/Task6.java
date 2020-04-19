package _2Algorithmization.arrays;

/*
Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

import myLibrary.RandomArray;

public class _6Task {

    public static void main(String[] args) {

        int n = 10; // размер массива
        int count = 0; // счетчик количества делителей
        double sum = 0; //сумма чисел, порядковый номер которых - простое число

        // объявление и инициализация массива
        double[] arr;
        arr = RandomArray.newDouble(n, false);
        System.out.print("New: ");
        RandomArray.showArray(arr);

        for (int i = 1; i < arr.length; i++){
            for (int j = 1; j <= i; j++){
                if (i % j == 0) count++;
            }
            if (count < 3) {
                sum += arr[i];
            }
            count = 0;
        }
        System.out.printf("\nSum = %.2f", sum);

    }

}
