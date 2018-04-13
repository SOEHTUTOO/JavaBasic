import java.util.Scanner;
public class App {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		System.out.println("Please Enter Your Name.");
		scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Your Name is "+name+"\n");
		
		System.out.println("Please Enter Your Age Again.");
		int age = scanner.nextInt();
		System.out.println("Your Age is "+age);
		
		
	}
}
