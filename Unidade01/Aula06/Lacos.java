package Unidade01.Aula06;

public class Lacos {
    public static void main(String[] args) {

        // Estrutura de repetição for -- acontece um número definido de vezes
        for (int i = 0; i <= 10; i++) {
            System.out.println("Valor de i: " + i);
        }

        // Estrutura de repetição while -- acontece 0 vezes se a condição for falsa
        int j = 0;
        while (j <= 10) {
            System.out.println("Valor de j: " + j);
            j++;
        }

        // Estrutura de repetição do while -- acontece 1 vez mesmo que a condição seja
        // falsa
        int k = 11;
        do {
            System.out.println("Valor de k: " + k);
            k++;
        } while (k <= 10);

    }
}
