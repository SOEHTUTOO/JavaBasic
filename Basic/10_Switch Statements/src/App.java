/*
 *  int, String, Enum can be use with switch.
 */
public class App {

	public static void main(String[] args) {
		
		int x = 1;
		
		switch(x) {
		
		case 1:
			System.out.println("One");
		break;
		case 2:
			System.out.println("Two");
		break;
		case 3:
			System.out.println("Three");
		break;
		default:
			System.out.println("There is no numbers.");
		break;
		}
		
		String name = "Mg Mg";
		
		switch(name) {
		
		case "Mg Mg":
			System.out.println("Hi, Mg Mg.");
		break;
		case "Su Su":
			System.out.println("Hi, Su Su.");
		break;
		case "Hla Hla":
			System.out.println("Hi, Hla Hla.");
		break;
		default:
			System.out.println("Who are you?");
		break;
		}
	}
}
