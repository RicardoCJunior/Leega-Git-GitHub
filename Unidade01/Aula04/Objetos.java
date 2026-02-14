package Aula04;

public class Objetos {
    // Atributos

    private String nome;
    private int idade;
    private float peso;

    // construtor

    public Objetos(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // método

    public void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }

    public static void main(String[] args) {
        Objetos pessoa = new Objetos("Ricardo", 30, 70.5f);
        Objetos pessoa2 = new Objetos("Pedro", 12, 50.5f);
        System.out.println(pessoa); // Imprime o endereço de memória do objeto, após a pessoa .nome,idade ou peso
        System.out.println(pessoa2);

        pessoa.exibirInfos();
        pessoa2.exibirInfos();

    }

}
