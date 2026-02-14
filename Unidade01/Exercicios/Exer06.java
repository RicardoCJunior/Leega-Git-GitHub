package Exercicios;

public class Exer06 {
    public static void main(String[] args) {

        // Exercício 6: Estruturas Condicionais e Laços
        // Escreva um programa que encontre todos os números primos entre 1 e 100 e
        // imprima-os na
        // tela.

        System.out.println("Números primos entre 1 e 100:");

        for (int i = 2; i <= 100; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        }
    }

}
