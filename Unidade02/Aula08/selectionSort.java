package Unidade02.Aula08;

public class selectionSort {


    //Metodo de substituicao selection sort, 
    public static void selectionSort(int[] array) {
        int tamanho = array.length;
        for (int i = 0; i < tamanho; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 5, 7, 9, 5, 7, 3, 1, 5, 6, 8 };
        System.out.println(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println(array);
        System.out.println("Ordenado: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

}
