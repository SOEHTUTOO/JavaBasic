
public class App {
	public static void main(String[] args) {
		
		Person person1 = new Person(); // instantiate
		person1.name = "Aung Aung";
		person1.id = 123;
		
		Person person2 = new Person();
		person2.name = "Hla Hla";
		person2.id = 456;
		
		Business p1job = new Business();
		p1job.job = "Hacker";
		
		person1.showInfo();
		person2.showInfo();
		p1job.showJob();
	}
}
