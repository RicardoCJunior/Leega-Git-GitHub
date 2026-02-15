package Unidade02.Aula03;

import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {
    public static void main(String[] args) {

        // LIFO - Last In First Out
        Deque<Integer> pilha = new ArrayDeque<>();

        // push - Adicionar um item no topo da pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(70);

        System.out.println("Pilha: " + pilha);

        // peek - Ver o item no topo da pilha sem removê-lo
        System.out.println("Topo da pilha: " + pilha.peek());
        // pop - Remover o item no topo da pilha e retorná-lo
        System.out.println("Removendo o topo: " + pilha.pop());
        System.out.println("Pilha: " + pilha);

        //desempilhar todos os itens
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
