import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		
		list.add("Apple");
		list.add("Orange");
		
		System.out.println(list.size());
		
		list.remove(1);
		
		System.out.println(list.size());
		
		String value = list.get(0);
		
		System.out.println(value);
		
		
	}
}
