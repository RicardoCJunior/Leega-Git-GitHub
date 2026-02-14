package Aula02;

public class ExemplosPrimitivosDeDados {
    public static void main(String[] args) {
        byte valorByte = 127;
        short valorShort = 32767;
        int valorInt = 2147483647;
        long valorLong = 9223372036854775807L;

        float valorFloat = 3.14f;
        double valorDouble = 3.141592653589793;

        char valorChar = 'A';
        boolean valorBoolean = true;

        final float PI = 3.14f; // Constante não vai ser alterado
        // vPi = 3.1415f; // Erro, não pode alterar o valor de uma constante

        System.out.println("Valor byte: " + valorByte);
        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor long: " + valorLong);
        System.out.println("Valor float: " + valorFloat);
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor char: " + valorChar);
        System.out.println("Valor boolean: " + valorBoolean);
        System.out.println("Valor de PI: " + PI);

    }
}
