import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String teste2 = "00000001";

		List<String> list = new ArrayList<>();
		list.add("Teste 1");
		list.add("Teste 2");
		list.add("Teste 3");
		list.add("Teste 4");
		list.add("Teste 5");

//		for (String teste : list) {
//			System.out.println(teste);
//		}

		list.forEach(str -> System.out.println(str));

		System.out.println(list.isEmpty());

		System.out.println(Long.parseLong(teste2));
	}

}
