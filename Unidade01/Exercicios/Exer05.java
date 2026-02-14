package Exercicios;

public class Exer05 {
    public static void main(String[] args) {
        
//Exercício 5: Matrizes (Arrays)
// Crie uma matriz (array) de números inteiros. Encontre e imprima o maior valor na matriz.

        int[] numeros = {10, 20, 30, 40, 50};
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior valor na matriz é: " + maior);
    }
    
}
