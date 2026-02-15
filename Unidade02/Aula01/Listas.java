package Unidade02.Aula01;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {

        String[] ListaCompras = new String[3];

        ListaCompras[0] = "Arroz";
        ListaCompras[1] = "Feijão";
        ListaCompras[2] = "Macarrão";

        // Adicionar items novos a lista dinamica
        ArrayList<String> ListaComprasUpgrade = new ArrayList<String>();
        ListaComprasUpgrade.add("Arroz");
        ListaComprasUpgrade.add("Feijão");
        ListaComprasUpgrade.add("Macarrão");

        System.out.println("1 produto: " + ListaCompras[1]);
        System.out.println("Lista de compras: " + ListaComprasUpgrade.get(1));

        // Ver o tamanho das listas, quantos items tem
        System.out.println(ListaCompras.length);
        System.out.println(ListaComprasUpgrade.size());

        // Verificar se um item existe na lista
        System.out.println(ListaComprasUpgrade.contains("Arroz"));

        // Remover um item da lista
        ListaComprasUpgrade.remove("Arroz");
        ListaComprasUpgrade.remove(0);

        // Remover todos os itens da lista
        ListaComprasUpgrade.clear();
    }

}
