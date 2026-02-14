package Exercicios;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        
//Exercício 2: Estruturas Condicionais
//Escreva um programa que leia um número e determine se ele é par ou ímpar. Imprima o
//resultado na tela.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O numero digitado foi: " + numero);

        if (numero % 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }
    }

}
