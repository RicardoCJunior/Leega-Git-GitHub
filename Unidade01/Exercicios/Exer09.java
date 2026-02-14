package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer09 {

    // Exercício 9: Programação Orientada a Objetos
    // Atividade 1
    // Crie uma classe Pessoa com atributos como nome, idade e endereço. Implemente
    // um
    // programa que permite ao usuário criar e gerenciar uma lista de pessoas.

    public static void main(String[] args) {

        class Pessoa {
            String nome;
            int idade;
            String endereco;

            Pessoa(String nome, int idade, String endereco) {
                this.nome = nome;
                this.idade = idade;
                this.endereco = endereco;
            }
        }

        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                System.out.print("Endereço: ");
                String endereco = sc.nextLine();

                pessoas.add(new Pessoa(nome, idade, endereco));
                System.out.println("Pessoa adicionada!");

            } else if (opcao == 2) {

                if (pessoas.isEmpty()) {
                    System.out.println("Nenhuma pessoa cadastrada.");
                } else {
                    System.out.println("\n--- LISTA DE PESSOAS ---");
                    for (Pessoa p : pessoas) {
                        System.out.println("Nome: " + p.nome +
                                " | Idade: " + p.idade +
                                " | Endereço: " + p.endereco);
                    }
                }
            }

        } while (opcao != 0);

        System.out.println("Encerrando...");
        sc.close();
    }
}
