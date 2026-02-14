package Exercicios;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        // Exercício 8: Estruturas Condicionais e Listas
        // Crie um programa que solicite ao usuário que insira uma lista de números
        // inteiros e, em
        // seguida, encontre e exiba o número que mais se repete.

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números deseja inserir?");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        int maisFreq = nums[0];
        int maxCont = 0;

        for (int i = 0; i < n; i++) {
            int cont = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    cont++;
                }
            }
            if (cont > maxCont) {
                maxCont = cont;
                maisFreq = nums[i];
            }
        }

        System.out.println("Número que mais se repete: " + maisFreq);
    }
}
