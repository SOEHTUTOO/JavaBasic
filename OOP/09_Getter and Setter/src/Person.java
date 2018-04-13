import java.util.Scanner;

public class Person {

	private int id;
	private String name;
	
	Scanner input = new Scanner(System.in);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
