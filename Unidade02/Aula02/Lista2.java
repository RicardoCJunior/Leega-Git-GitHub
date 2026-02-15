package Unidade02.Aula02;

import java.util.ArrayList;

public class Lista2 {
    public static void main(String[] args) {

        ArrayList<String> ItemsDoLanche = new ArrayList<String>();
        ItemsDoLanche.add("Pão");
        ItemsDoLanche.add("Hambúrguer");
        ItemsDoLanche.add("Queijo");
        ItemsDoLanche.add("Alface");

        ArrayList<String> PartesDoLanche = (ArrayList<String>) ItemsDoLanche.clone();
        System.out.println("Partes do lanche: " + PartesDoLanche);

        PartesDoLanche.add("Tomate");
        System.out.println("Partes do lanche: " + PartesDoLanche);

        ItemsDoLanche.clear();
        System.out.println("ItemsDoLanche: " + ItemsDoLanche);
        System.out.println("PartesDoLanche: " + PartesDoLanche);

        // Verificar se a lista está vazia
        System.out.println(ItemsDoLanche.isEmpty());

        boolean existe = false;
        // Imprimir os itens da lista usando um loop
        for (String item : PartesDoLanche) {
            System.out.println(item);

            if (item.equalsIgnoreCase("Tomate")) {
                existe = true;
            }
        }

        if (existe) {
            System.out.println("O lanche tem tomate!");
        } else {
            System.out.println("O lanche não tem tomate.");
        }

    }

}
