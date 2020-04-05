package _2Algorithmization.arrays;

/*
    Даны действительные числа a1, a2, ..., aN. Поменять местами наибольший и наименьший элементы.
 */

import myLibrary.RandomArray;

public class _4Task {

    public static void main(String[] args) {

        int n = 10; // размер массива
        double temp; // временное храниние значений переменных

        //индексы max и min в массиве
        int pMax;
        int pMin;

        // объявление и инициализация массива
        double[] arr;
        arr = RandomArray.newDouble(n, true);
        System.out.print("new array: ");
        RandomArray.showArray(arr);

        // поиск индексов максимального и минимального элементов
        pMin = 0;
        pMax = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[pMin]) {
                pMin = i;
            }
            else if (arr[i] > arr[pMax]){
                pMax = i;
            }
        }

        temp = arr[pMin];
        arr[pMin] = arr[pMax];
        arr[pMax] = temp;

        System.out.print("\nafter changed:");
        RandomArray.showArray(arr);


    }

}
