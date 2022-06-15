import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String> lista = new ArrayList<>();
        lista.add("Teste1");
        lista.add("Teste2");

        lista.forEach(teste -> {
            System.out.println(teste);
        });

    }
}
