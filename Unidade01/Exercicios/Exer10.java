package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Exercício 10: Desafio Final
//Implemente um sistema de gerenciamento de estoque para uma loja, permitindo ao usuário
//adicionar, remover e atualizar itens no estoque. Utilize classes, listas e estruturas
//condicionais.

class Item {
    private static int contadorId = 1;

    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, int quantidade, double preco) {
        this.id = contadorId++;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override //tive que pesquisar
    public String toString() {
        return String.format("ID: %d | Nome: %s | Qtd: %d | Preço: R$ %.2f",
                id, nome, quantidade, preco);
    }
}

class Estoque {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(String nome, int quantidade, double preco) {
        if (nome == null || nome.isBlank() || quantidade < 0 || preco < 0) {
            System.out.println("Dados inválidos. Tente novamente.");
            return;
        }
        Item item = new Item(nome.trim(), quantidade, preco);
        itens.add(item);
        System.out.println("Item adicionado: " + item);
    }

    public void removerItem(int id) {
        Item item = buscarPorId(id);
        if (item != null) {
            itens.remove(item);
            System.out.println("Item removido: " + item);
        } else {
            System.out.println("Item com ID " + id + " não encontrado.");
        }
    }

    public void atualizarItem(int id, String novoNome, Integer novaQtd, Double novoPreco) {
        Item item = buscarPorId(id);
        if (item == null) {
            System.out.println("Item com ID " + id + " não encontrado.");
            return;
        }
        if (novoNome != null && !novoNome.isBlank()) item.setNome(novoNome.trim());
        if (novaQtd != null && novaQtd >= 0) item.setQuantidade(novaQtd);
        if (novoPreco != null && novoPreco >= 0) item.setPreco(novoPreco);

        System.out.println("Item atualizado: " + item);
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }
        System.out.println("=== Itens no Estoque ===");
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public void buscarPorNome(String termo) {
        String q = termo == null ? "" : termo.trim().toLowerCase();
        boolean encontrou = false;
        for (Item item : itens) {
            if (item.getNome().toLowerCase().contains(q)) {
                System.out.println(item);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum item encontrado para: " + termo);
        }
    }

    private Item buscarPorId(int id) {
        for (Item item : itens) {
            if (item.getId() == id) return item;
        }
        return null;
    }
}

public class Exer10 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Estoque estoque = new Estoque();

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = lerInteiro("Escolha uma opção: ");
            switch (opcao) {
                case 1 -> adicionarFluxo();
                case 2 -> removerFluxo();
                case 3 -> atualizarFluxo();
                case 4 -> estoque.listarItens();
                case 5 -> buscarFluxo();
                case 0 -> System.out.println("Saindo... Até mais!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("====== GERENCIAMENTO DE ESTOQUE ======");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Remover item");
        System.out.println("3 - Atualizar item");
        System.out.println("4 - Listar itens");
        System.out.println("5 - Buscar por nome");
        System.out.println("0 - Sair");
    }

    private static void adicionarFluxo() {
        System.out.println("--- Adicionar Item ---");
        String nome = lerTexto("Nome: ");
        int qtd = lerInteiro("Quantidade: ");
        double preco = lerDouble("Preço: ");
        estoque.adicionarItem(nome, qtd, preco);
    }

    private static void removerFluxo() {
        System.out.println("--- Remover Item ---");
        int id = lerInteiro("ID do item: ");
        estoque.removerItem(id);
    }

    private static void atualizarFluxo() {
        System.out.println("--- Atualizar Item ---");
        int id = lerInteiro("ID do item: ");
        System.out.println("Deixe em branco para manter o valor atual.");
        String novoNome = lerTextoOpcional("Novo nome: ");
        Integer novaQtd = lerInteiroOpcional("Nova quantidade: ");
        Double novoPreco = lerDoubleOpcional("Novo preço: ");
        estoque.atualizarItem(id, novoNome, novaQtd, novoPreco);
    }

    private static void buscarFluxo() {
        System.out.println("--- Buscar por Nome ---");
        String termo = lerTexto("Termo de busca: ");
        estoque.buscarPorNome(termo);
    }

    private static String lerTexto(String msg) {
        System.out.print(msg);
        String s = scanner.nextLine();
        while (s == null || s.isBlank()) {
            System.out.print("Entrada vazia. Digite novamente: ");
            s = scanner.nextLine();
        }
        return s;
    }

    private static String lerTextoOpcional(String msg) {
        System.out.print(msg);
        String s = scanner.nextLine();
        return s.isBlank() ? null : s;
    }

    private static int lerInteiro(String msg) {
        while (true) {
            System.out.print(msg);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Tente novamente.");
            }
        }
    }

    private static Integer lerInteiroOpcional(String msg) {
        System.out.print(msg);
        String input = scanner.nextLine().trim();
        if (input.isBlank()) return null; //pesquisei
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Mantendo valor atual.");
            return null;
        }
    }

    private static double lerDouble(String msg) {
        while (true) {
            System.out.print(msg);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input.trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Tente novamente.");
            }
        }
    }

    private static Double lerDoubleOpcional(String msg) {
        System.out.print(msg);
        String input = scanner.nextLine().trim();
        if (input.isBlank()) return null;
        try {
            return Double.parseDouble(input.replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Mantendo valor atual.");
            return null;
        }
    }
}
