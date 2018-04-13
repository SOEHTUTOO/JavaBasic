import java.util.Scanner;
import java.util.Random;
public class App {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		Random random = new Random();
		
		int number = random.nextInt(100);
		
		System.out.print("Guess My Number, If You Can. Enter Your Number Here >>");
		int userInput;
		
		while((userInput = input.nextInt())!=number) {
			if(userInput>number) {
				System.out.print("Greater than my number. Enter Again>>");
			}else {
				System.out.print("Less than my number. Enter Again>>");
			}
		}
		
		System.out.println("Correct");
	}
}
