package Unidade02.Aula04;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilhas02 {
    private String titulo;
    private int nPaginas;

    public Pilhas02(String titulo, int nPaginas) {
        this.titulo = titulo;
        this.nPaginas = nPaginas;
    }

    public static void main(String[] args) {
        Deque<Object> pilhaLivros = new ArrayDeque<>();

        Pilhas02 doc = new Pilhas02("Java para Iniciantes", 300);

        Pilhas02 doc2 = new Pilhas02("Java para Iniciantes 2", 234);

        Pilhas02 doc3 = new Pilhas02("Java para Iniciantes 3", 456);

        Pilhas02 doc4 = new Pilhas02("Java para Iniciantes 4", 312);

        Pilhas02 doc5 = new Pilhas02("Java para Iniciantes 5", 241);

        pilhaLivros.push(doc);
        pilhaLivros.push(doc2);
        pilhaLivros.push(doc3);
        pilhaLivros.push(doc4);
        pilhaLivros.push(doc5);

        while (!pilhaLivros.isEmpty()) {
            Pilhas02 tempDocumentos = (Pilhas02) pilhaLivros.pop();
            System.out.println("Título: " + tempDocumentos.titulo);
            System.out.println("Número de Páginas: " + tempDocumentos.nPaginas);
            System.out.println("-----------------------------");

        }

    }
}
