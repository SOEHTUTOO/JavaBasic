
public class App {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Hla Hla";
		p1.id = 33;
		
		Person p2 = new Person();
		p2.name = "Su Su";
		p2.id = 44;
		
		p1.showInfo();
		p2.showInfo();
		
		Person.showCount();
	}
}
