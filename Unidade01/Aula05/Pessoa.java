package Unidade01.Aula05;

import java.util.Scanner;

public class Pessoa {

    // Atributos

    private String nome;
    private int idade;
    private float peso;

    // contrutor

    public Pessoa(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // metodos

    public void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }

    public void envelhecer() {
        this.idade += 1;
        // this.idade = this.idade + 1;

    }

    // gets e sets

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public static void main(String[] args) {

        // scanner para ler um numero do usuario e armazenar informações da pessoa
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa("Ricardo", 30, 70.5f);
        pessoa.exibirInfos();
        pessoa.envelhecer(); // somou +1 na idade
        pessoa.exibirInfos();

        // setters
        pessoa.setNome("Leonardo");
        pessoa.setPeso(100.7f);
        pessoa.setIdade(123);
        pessoa.exibirInfos();

        // Scanner continuação para ler informações da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int indade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o peso da pessoa: ");
        float peso = Float.parseFloat(scanner.nextLine());
        scanner.close();

        Pessoa pessoa2 = new Pessoa(nome, indade, peso);

        pessoa2.exibirInfos();

    }
}