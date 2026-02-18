
import java.util.Map;
import java.util.HashMap;

public class MapExemplo {

    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        // adiciona no mapa a chave e o valor (k,v)
        mapa.put("Leo", 30);
        mapa.put("Alice", 18);
        mapa.put("Joao", 14);

        // retorna o valor da chave passada
        System.out.println(mapa.get("Leo"));

        // substitiu o valor da chave passada
        mapa.replace("Leo", 123);
        System.out.println(mapa);

        // Adiciona no mapa caso nao exista
        mapa.putIfAbsent("Ricardo", 785);
        System.out.println(mapa);

        // remove a chave passada
        // mapa.remove("Ricardo");
        // mapa.remove("Leo"); Comentados pra testar o "isEmpty"
        // mapa.remove("Alice");
        // mapa.remove("Joao");
        System.out.println(mapa);

        if (mapa.containsKey("Leo")) {
            System.out.println("Existe");
        } else {
            System.out.println("Nao existe");
        }

        // Existe valor passado
        if (mapa.containsValue(123)) {
            System.out.println("Existe");
        } else {
            System.out.println("Nao existe");
        }

        // Verificar se esta vazio
        if (mapa.isEmpty()) {
            System.out.println("O Mapa esta vazio");
        }

        // verificar todo o mapa, nomes
        for (String nome : mapa.keySet()) {
            System.out.println(nome);
        }

        // ver tamanho do mapa
        int tamanho = mapa.size();
        System.out.println("O tamanho do mapa e: " + tamanho);

    }
}
