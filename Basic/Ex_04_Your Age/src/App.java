import java.util.Scanner;
public class App {
	private static Scanner input;

	public static void main(String[] args) {

	input = new Scanner(System.in);
	
	System.out.println("Please enter your name.");
	String name = input.nextLine();
	System.out.println("Please enter your age.");
	int age = input.nextInt();
	
	if(age>=60 && age <=80 ) {
		System.out.println("Hi "+name+", you are too old.");
	}else if(age<=60 && age>=18) {
		System.out.println("Hi "+name+", you are an adult.");
	}else if(age<=18){
		System.out.println("Hi "+name+", you are still young.");
	}else if(age<=100 && age>80){
		System.out.println("Hi "+name+", you are really near to die.");
	}else {
		System.out.println("Hi "+name+". Are you sure?.");
	}
	
}
}
