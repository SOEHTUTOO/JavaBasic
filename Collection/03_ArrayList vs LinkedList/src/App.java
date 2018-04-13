import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		
		testList("ArrayList : ", list1);
		testList("LinkedList : ", list2);
	}
	
	public static void testList(String type, List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i<100000; i++) {
			list.add(i);
		}
	
		for(int i = 0; i<100000; i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Taken Time For "+type+(end-start));
		
	}
	
}
