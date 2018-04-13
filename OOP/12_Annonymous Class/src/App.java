
public class App {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.showInfo();
		
		Person p2 = new Student();
		p2.showInfo();
		
		Person p3 = new Person() {
			
			@Override
			public void showInfo() {
				System.out.println("Hi, I am annonymous.");
			}
		};
		
		p3.showInfo();
		
		Info info1 = new Student();
		info1.show();
		
		Info info2 = new Student() {
			
			@Override 
			public void show() {
				System.out.println("HIIIIII");
			}
		};
		
		info2.show();
		
	}
}
