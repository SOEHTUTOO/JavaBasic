import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
//		Random random = new Random();
//		
//		int x = random.nextInt(100); // 0 -> 99
//		
//		System.out.println(x);
		
	Scanner scanner = new Scanner(System.in);
	
	int x = 3;
	
	System.out.println("Enter Number.");
	
	int inputNum;
	
	while((inputNum = scanner.nextInt()) != x) {
		System.out.println("Enter Number.");
	}

// *** Another Way ***
//	int inputNum = scanner.nextInt();
//	
//	while (inputNum!=x) {
//		System.out.println("Enter Number");
//		inputNum= scanner.nextInt();
//	}
		
	}
}
