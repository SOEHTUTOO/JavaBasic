import java.util.Deque;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
		Deque<Integer> numDeque = new LinkedList<>();
		numDeque.addFirst(2);
		numDeque.addLast(3);
		numDeque.addLast(4);
		numDeque.addFirst(1);
		
		for(Integer num:numDeque) {
			System.out.print(num);
		}
		
		System.out.println("\nFirst NumDeque Number is "+numDeque.getFirst());
		System.out.println("Last NumDeque Number is "+numDeque.getLast());
		
		numDeque.removeLast();
		numDeque.removeFirst();
		
		System.out.println("After Removing ...");
		System.out.println("First NumDeque Number is "+numDeque.getFirst());
		System.out.println("Last NumDeque Number is "+numDeque.getLast());
	}
	
}
