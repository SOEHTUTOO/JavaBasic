
public class App {

	public static void main(String[] args) {

		String mainString = "22 + 33";
		
		String [] splitedString = mainString.split("+");
		for(String string: splitedString) {
			System.out.println(string);
		}
		
	}
}