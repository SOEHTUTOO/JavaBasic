package demo1;

public class Person {
	
	// Method Overloading ...
	
	public void showInfo() {
		System.out.println("I am Person");
	}
	
	public void showInfo(String name) {
		System.out.println("I am Person with String name "+name);
		
	}
	
	public void showInfo(int age) {
		System.out.println("I am Person with Int age "+age);
	}
	
	public void showInfo(String name , int age) {
		System.out.println("I am "+name+" and I am "+age+" years old.");
	}

}
