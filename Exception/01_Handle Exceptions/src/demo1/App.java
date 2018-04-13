package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {
		
		File file = new File("D:\\Notfound.txt");
		
		try {
			
			FileReader reader = new FileReader(file);
			System.out.println("OK");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("Continue...");
	}
}
