package _2Algorithmization.arrays;

/*
    Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

import myLibrary.RandomArray;

public class _3Task {

    public static void main(String[] args) {

        int n = 10; // размер массива

        // счетчики положительных, отрицательных и равных нулю членов массива
        int countUp = 0;
        int countDown = 0;
        int countZero = 0;

        // объявление и инициализация массива
        double[] arr;
        arr = RandomArray.newDouble(n,true);
        System.out.print("new array: ");
        RandomArray.showArray(arr);

        for (double num: arr){
            if (num > 0) countUp++;
            else if (num < 0) countDown++;
                 else countZero++;
        }

        System.out.println("\nПоложительных: " + countUp + ";\nОтрицательных: " + countDown + ";\nНулевых: " + countZero + ".");

    }

}
