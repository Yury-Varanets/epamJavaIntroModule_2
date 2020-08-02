package _2Algorithmization.arrays;

/*
Даны действительные числа a1, a2, ..., aN. Найти max(a1 + a2n, a2 + a2n-1, ..., an + an+1).
 */

import myLibrary.RandomArray;

public class _7Task {

    public static void main(String[] args) {

        double[] arr;
        double temp;
        int begin = 0;
        double max1;
        double max2;

        arr = RandomArray.newDouble(8, false);
        System.out.print("new array: ");
        RandomArray.showArray(arr);

        int end = arr.length - 1;
        int middle = arr.length / 2;

        max1 = arr[begin];
        max2 = arr[end];

        for (begin = 1, --end; begin < middle; begin++, end--){
            temp = arr[begin] + arr[end];
            if (temp > (max1 + max2)) {
                max1 = arr[begin];
                max2 = arr[end];
            }
        }

        System.out.println();
        System.out.printf("max in array: %.2f + %.2f = %.2f.", max1, max2, max1 + max2);

    }

}
