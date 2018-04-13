import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		
		Collection<Integer> col1 = new ArrayList<>();
		col1.add(123);
		col1.add(456);
		col1.add(789);
		
		System.out.println(col1.size());
		
		//int value = col1.get(2); can't use because of Interface
		
		col1.remove(789);

		System.out.println(col1.size());
		
		col1.add(789);
		
		Iterator<Integer> i = col1.iterator();
		
//		int firstElement = i.next();
//		System.out.println(firstElement);
//		
//		int secondElement = i.next();
//		System.out.println(secondElement);
//		
//		int thirdElement = i.next();
//		System.out.println(thirdElement);
		
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		
	}

}
