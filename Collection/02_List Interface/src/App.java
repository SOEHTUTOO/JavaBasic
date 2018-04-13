import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); // Can use ArrayList with LinkedList
		list.add(90);
		list.add(78);
		list.add(56);
		list.add(34);
		list.add(12);
		
		System.out.println(list.get(1));
		
		list.remove(1);
		
		list.add(1,78); // To add direct to index number.
		
		for(int val:list) {
			System.out.print(val);
		}
		
		Collections.sort(list);
		
		System.out.print("\nAfter sorting:\n");
		
		for(int val:list) {
			System.out.print(val);
		}
		
		
		
	}
	

}
