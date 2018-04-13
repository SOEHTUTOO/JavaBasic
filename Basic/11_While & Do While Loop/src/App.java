/*
 * Iteration (loop) Don't Repeat yourself
 */
public class App {

	public static void main(String[] args) {
		
		int x = 0;
		
		while(x<10) {
			System.out.println(x);
			x++; // x += 3;
		}
		
		do {
			System.out.println(x);
			x++;
		}while(x<20);
	}
}
