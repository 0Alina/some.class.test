// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        //declaram ceva variabile
        String i = "test"; //daca nu se atribuie nimic e NULL
        int a = 5; //daca nu se atribuie nimic e 0

        //introduc o conditie
        if (a>=5) {
            System.out.println("Numar >= ca 5");
        } else {
            System.out.println("Numar <= ca 5");
        }

        //declar o lista
        List<String> listaLocatie = new ArrayList<>();
        listaLocatie.add("Chisinau");
        listaLocatie.add("Causeni");
        System.out.println("Locatiile in care am locuit = " + listaLocatie.get(1) + " si " + listaLocatie.get(0));

        //utilizez unstream pentru a filtra elementele din lista
        List<String> rezultatFiltrat = listaLocatie.stream()
                .filter(n -> n.length() == 7 )
                .collect(Collectors.toList());
        System.out.println("Orasul cu 7 litere = "+ rezultatFiltrat);

        //arunc o exceptie
        try {
            int rezultat = 5/0;
        } catch (ArithmeticException r) {
            System.out.println("A aparut o exceptie" + r.getMessage());
        }

        // creeez cate o instanta pentru clasele create
        SAKURA SAKURA = new SAKURA("cires japonez");
        System.out.println("Sakura" + SAKURA);

        ONIGIRI ONIGIRI = new ONIGIRI("ton");
        System.out.println("Onigiri" + ONIGIRI);

        // Setter (seteaza o noua valoare membrelor de date "specie" si "umplututra")
        SAKURA.setSpecie("cires american");
        ONIGIRI.setUmplutura("kimchi");

        // Getter (returneaza valoare pe care am modificat-o cu setter-ul)
        System.out.println("Alternativa sakurei clasice = " + SAKURA.getSpecie());
        System.out.println("Alternativa onigiri-ului cu ton = " + ONIGIRI.getUmplutura());
    }
}