import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(15, "teste");
		map.put(11, "teste2");
		map.put(12, "teste3");
		map.put(65, "teste4");
		map.put(38, "teste5");
		map.put(87, "teste6");
		map.put(33, "teste7");
		map.put(45, "teste8");
		map.put(17, "teste9");
		map.print();
		System.out.println(map.getValue(15));
		map.getValue(38);
		List<String> teste = new ArrayList<String>();
		teste.add(0,"teste");
//		teste.add(10,"teste 10");
		System.out.println(teste);
	}

}
