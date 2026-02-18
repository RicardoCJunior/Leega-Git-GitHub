package Unidade02.Aula09;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int tamanho = arr.length;

        for (int i = 1; i < tamanho; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];

                j--;

            }

            arr[j + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 7, 89, 5, 3, 2, 4, 6, 6, 3, 5 };

        System.out.print("Array desordenado: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        insertionSort(arr);

        System.out.println(" ");
        System.out.print("Array ordenado: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}