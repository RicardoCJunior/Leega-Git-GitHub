package Exercicios;

import java.util.ArrayList; // Tive que pesquisar sobre ArrayList para isso
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

//Exercício 4: Listas (ArrayList)
//Implemente um programa que permita ao usuário adicionar e remover elementos de uma
//lista dinâmica (por exemplo, ArrayList) de números inteiros.

        Scanner scanner = new Scanner(System.in);

        // Lista dinamica, tive que pesquisar sobre ArrayList para isso
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Digite um numero para adicionar: ");
        int Numero1 = Integer.parseInt(scanner.nextLine());
        numeros.add(Numero1); // Tive que pesquisar

        System.out.print("Digite outro numero para adicionar: ");
        int Numero2 = Integer.parseInt(scanner.nextLine());
        numeros.add(Numero2); // Tive que pesquisar

        System.out.println("Lista atual: " + numeros);

        System.out.print("Digite um numero para remover: ");
        int remover = Integer.parseInt(scanner.nextLine()); // Tive que pesquisar
        numeros.remove(Integer.valueOf(remover));

        System.out.println("Lista apos remoção: " + numeros);
    }
}
