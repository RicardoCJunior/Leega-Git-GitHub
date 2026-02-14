package Unidade01.Aula03;

import java.util.Scanner;

public class ArraysMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays são estruturas de dados que armazenam uma coleção de elementos do
        // mesmo tipo. Eles são usados para armazenar e manipular conjuntos de dados
        // relacionados. Em Java, os arrays são objetos que podem conter elementos de
        // qualquer tipo, incluindo tipos primitivos e objetos.
        int[] numeros = { 1, 2, 3, 4, 5 };
        int[] numeros2 = new int[5];

        numeros2[0] = 10;
        numeros2[1] = 20;
        numeros2[2] = 30;
        numeros2[3] = 40;
        numeros2[4] = 50;
        // numeros2[5] = 100; não pode usar pois está fora do limite do array

        System.out.println(numeros); // apenas mostra o endereço de memória do array

        System.out.println(numeros2[0]);
        System.out.println(numeros2[1]);
        System.out.println(numeros2[2]);
        System.out.println(numeros2[3]);
        System.out.println(numeros2[4]);

        // Matrizes são arrays multidimensionais, ou seja, arrays de arrays. Eles são
        // usados para representar dados em forma de tabela ou grade. Em Java, as
        // matrizes são implementadas como arrays de arrays, onde cada elemento do array
        // principal é um array secundário.
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(matriz[0][0]); // posição 1

        // scanner para ler um numero do usuario e armazenar no array
        System.out.print("Digite um Numero: ");
        numeros[0] = Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        System.out.println("O numero digitado foi: " + numeros[0]);

    }
}