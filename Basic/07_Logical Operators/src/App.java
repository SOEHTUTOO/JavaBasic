/*
 *  &&, ||, ! Locgical Operator
 */
public class App {
	
	public static void main(String[] args) {
		
		boolean value1 = 3 > 2 && 5 > 3; // true && true
		boolean value2 = 3 == 4 || 1 > 3; // false || false
		
		boolean value3 = !(6 < 3); // Not !
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
