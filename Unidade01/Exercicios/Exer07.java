package Exercicios;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        // Exercício 7: Listas e Matrizes
        // Implemente um jogo da velha (Tic-Tac-Toe) usando uma matriz para representar
        // o tabuleiro.
        // Permita que dois jogadores façam jogadas alternadas.

        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };

        char jogador = 'X';
        boolean jogoAtivo = true;

        while (jogoAtivo) {

            System.out.println("  1   2   3");
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j]);
                    if (j < 2)
                        System.out.print(" | ");
                }
                System.out.println();
                if (i < 2)
                    System.out.println("  ---------");
            }

            System.out.println("\nJogador " + jogador + ", escolha linha e coluna (1-3): ");

            int linha = sc.nextInt() - 1;
            int coluna = sc.nextInt() - 1;

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida! Tente novamente.\n");
                continue;
            }

            tabuleiro[linha][coluna] = jogador;

            if ((tabuleiro[0][0] == jogador && tabuleiro[0][1] == jogador && tabuleiro[0][2] == jogador) ||
                    (tabuleiro[1][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[1][2] == jogador) ||
                    (tabuleiro[2][0] == jogador && tabuleiro[2][1] == jogador && tabuleiro[2][2] == jogador) ||
                    (tabuleiro[0][0] == jogador && tabuleiro[1][0] == jogador && tabuleiro[2][0] == jogador) ||
                    (tabuleiro[0][1] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][1] == jogador) ||
                    (tabuleiro[0][2] == jogador && tabuleiro[1][2] == jogador && tabuleiro[2][2] == jogador) ||
                    (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                    (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {

                System.out.println("\nJogador " + jogador + " venceu!");
                jogoAtivo = false;
                continue;
            }

            boolean cheio = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == ' ') {
                        cheio = false;
                        break;
                    }
                }
                if (!cheio)
                    break;
            }

            if (cheio) {
                System.out.println("\nEmpate! O tabuleiro está cheio.");
                jogoAtivo = false;
                continue;
            }

            jogador = (jogador == 'X') ? 'O' : 'X';
        }

        sc.close();
    }
}
