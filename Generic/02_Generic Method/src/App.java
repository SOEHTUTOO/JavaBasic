class Test {
	
	public static <T> void showInfo(T value) {
		System.out.println(value);
	}
	
}
public class App {

	public static void main(String[] args) {
		
		Test.showInfo("Hello");
		Test.<String>showInfo("How are you?");
		Test.<Integer>showInfo(123456);
	}
	
}
