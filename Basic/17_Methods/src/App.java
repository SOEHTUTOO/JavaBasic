/*
 * JVM -> main
 * main -> greet
 * main -> sayHi
 */
public class App {
	public static void main(String[] args) {
		greet();
		sayHi("Hla Hla"); // parameter passing
		int z = calArea(2,5);
		System.out.println("Z is "+z);
		String month = getMonth();
		System.out.println(month);
	}
	
	public static void greet() {
		System.out.println("Hello");
	}
	
	public static void sayHi(String name) {
		System.out.println("Hi, "+name);
	}
	
	public static int calArea(int x, int y) {
		int area = x * y;
		return area;
	}
	
	public static String getMonth() {
		return "September";
	}
}
