package _2Algorithmization.arrays;

/*
Дан целочисленный массив с количеством элементов N. Сжать массив, выбросив из него
каждый второй элемент(освободившиеся элементы заполнить нулями). Примечание.
Дополнительный массив не использовать.
 */

public class _10Task {

    public static void main(String[] args) {

        int n = 10; // размер массива

        // объявление и инициализация массива
        int[] arr = new  int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10) - (int)(Math.random() * 10);
            System.out.print(" " + arr[i]);
        }

        int j = 0;

        for (int i = 0; i <  arr.length; i += 2){
            arr[j] = arr[i];
            j++;
        }

        for ( ; j < arr.length; j++){
            arr[j] = 0;
        }

        System.out.println();
        for (int num: arr){
            System.out.print(" " + num);
        }

    }

}
