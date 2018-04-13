package demo1;

/*
 * public - everywhere
 * private - within class
 * protected - same package, subclass ( same or not package )
 * no-modifier - only same package.
 */

public class App {
	public static void main(String[] args) {
		
		Machine test1 = new Machine();
		test1.number = 13;
		//test1.name = "MG MG";
		test1.id = 15;
		test1.text = "Hello";
		
		test1.showInfo();
	}

}
