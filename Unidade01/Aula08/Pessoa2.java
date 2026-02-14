package Aula08;
import java.util.Scanner;

public class Pessoa2 {

    // Atributos

    private String nome;
    private int idade;
    private float peso;
    private float altura;

    // contrutor

    public Pessoa2(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    // metodos

    public void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    public float testeDeIMC() {
        float imc = this.peso / (this.altura * this.altura);
        return imc; 
    }

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

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o peso da pessoa: ");
        float peso = Float.parseFloat(scanner.nextLine());
        System.out.print("Digite a altura da pessoa: ");
        float altura = Float.parseFloat(scanner.nextLine());
        scanner.close();

        if (altura < 1.70) {
            System.out.println("Pessoa não pode passear no brinquedo");
        } else {
            System.out.println("Pessoa pode passear no brinquedo");
        }
        Pessoa2 pessoa2 = new Pessoa2(nome, idade, peso, altura);
        pessoa2.exibirInfos();

        float imc = pessoa2.testeDeIMC();
        System.out.println("O IMC da pessoa é: " + imc);
        //Da pra fazer o if else do ICM

    }

}
