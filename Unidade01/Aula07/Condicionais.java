package Aula07;

public class Condicionais {
    public static void main(String[] args) {
        // == igual
        // != diferente
        // > maior
        // < menor
        // >= maior ou igual
        // <= menor ou igual

        // && operador lógico AND
        // || operador lógico OR
        // ! operador lógico NOT

        // If sozinho
        int x = 10;
        if (x > 5) {
            System.out.println("x é maior que 5");
        }
        // If Else
        int y = 20;
        if (y < 15) {
            System.out.println("y é menor que 15");
        } else {
            System.out.println("y é maior ou igual a 15");
        }
        // If Else If
        int z = 30;
        if (z > 20 && z < 40) { // Ele faz o primeiro, mesmo que os de baixo sejam verdadeiros
            System.out.println("z está entre 20 e 40");
        } else if (z == 30) {
            System.out.println("z é igual a 30");
        } else {
            System.out.println("Esta errado");
        }

        // Switch Case
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana inválido");
        }

        // Uso dos operadores lógicos or
        int b = 10;
        int c = 20;
        if (b == 10 || c == 20) {
            System.out.println("b é igual a 10 ou c é igual a 20");
        }
    }
}
