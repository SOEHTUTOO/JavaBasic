
public class Person {
	
	static int count = 11;
	int id;
	String name;
	
	public void showInfo() {
		System.out.println("I am "+name+" with ID "+id+".");
	}
	
	public static void showCount() {
		System.out.println("Count is "+count);
	}
}
