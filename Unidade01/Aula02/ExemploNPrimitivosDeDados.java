package Unidade01.Aula02;

public class ExemploNPrimitivosDeDados {
    public static void main(String[] args) {

        char caracter = 'A';

        String nome = "Ricardo";

        nome = "Ricardo Cavalcante";

        enum DiaDaSemana { // coleção de palavras que se repete
            DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO
        }
        DiaDaSemana dia = DiaDaSemana.SEGUNDA;

        int[] numeros = { 1, 2, 3, 4, 5 }; // começa sempre em 0

        System.out.println("Valor do caracter: " + caracter);
        System.out.println("Valor do nome: " + nome);
        System.out.println("Valor do dia da semana: " + dia);
        System.out.println("Valor do array numeros: " + numeros[0]);

    }

}
