package Unidade02.Aula06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila02 {

    private int nPedido;
    private String[] itens;
    private float valor;

    public Fila02(int nPedido, String[] itens, float valor) {
        this.nPedido = nPedido;
        this.itens = itens;
        this.valor = valor;
    }

    public static void main(String[] args) {

        Queue<Fila02> fila = new LinkedList<>();

        String[] itemsTempPedido = { "lanche", "batata", "refrigerante" };
        Fila02 pedido1 = new Fila02(123, itemsTempPedido, 30.45f);

        String[] itemsTempPedido2 = { "lanche", "refrigerante" };
        Fila02 pedido2 = new Fila02(321, itemsTempPedido2, 23.45f);

        String[] itemsTempPedido3 = { "refrigerante" };
        Fila02 pedido3 = new Fila02(643, itemsTempPedido3, 10.45f);

        fila.offer(pedido1);
        fila.offer(pedido2);
        fila.offer(pedido3);

        while (!fila.isEmpty()) {
            Fila02 pedido = fila.poll();
            System.out.println("Pedido: " + pedido.nPedido);
            System.out.println("Itens: ");
            for (String item : pedido.itens) {
                System.out.println("- " + item);
            }
            System.out.println("Valor: R$ " + pedido.valor);
            System.out.println("-------------------------");

        }

    }
}
