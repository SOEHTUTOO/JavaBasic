package demo1;

import java.io.File;
import java.io.FileNotFoundException;

public class App {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\Filenotfound.txt");
		
		Reader reader = new Reader();
		
		try {
			reader.read(file);
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
