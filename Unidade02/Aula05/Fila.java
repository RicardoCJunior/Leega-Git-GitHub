package Unidade02.Aula05;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        // FIFO - First In First Out

        Queue<String> fila = new LinkedList<>();

        // Adicionar itens na fila
        fila.offer("1 fila");
        fila.offer("2 fila");
        fila.offer("3 fila");

        // System.out.println(fila.peek()); // exibe o primeiro item da fila sem
        // removê-lo
        // System.out.println(fila.poll()); // remove e exibe o primeiro item da fila

        while (!fila.isEmpty()) { // enquanto a fila não estiver vazia, remove e exibe o primeiro item
            System.out.println(fila.poll());
        }

    }

}
