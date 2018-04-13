package demo2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("D:\\Notfound.txt");
		
			
			FileReader reader = new FileReader(file);
			
			System.out.println("Continue...");
	}
}