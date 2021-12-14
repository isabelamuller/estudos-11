import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("cleber");
        l.add("matias");
        l.add("josue");
        l.add("juventino");
        l.add("visconde de sabugosa");
        Collections.sort(l); // deixar aleatorio

        l.addFirst("lucas"); // add uma palavra no inicio
        l.addLast("jonas"); // add uma palavra no fim


        System.out.println(l); // printa tudo oq tiver de forma horizontal

        for (String s : l) {
            System.out.println(s); // printa td oq tiver de forma vertical
        }
        System.out.println(" "); // so p separar kkkk

        System.out.println(l.get(2)); // printa o que tiver no index do numero q tu
        System.out.println(l.size()); // mostra o tamanho (qnts elementos)

    }
}