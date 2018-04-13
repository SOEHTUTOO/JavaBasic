package demo1;

/*
 * Polymorphism = many forms
 */

public class App {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.showInfo();
		p1.showInfo("Su Su");
		p1.showInfo(33);
		p1.showInfo("Su Su" , 33);
	}

}
