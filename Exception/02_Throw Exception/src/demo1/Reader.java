package demo1;

import java.io.File;
import java.io.FileNotFoundException;

public class Reader {

	public void read(File file) throws FileNotFoundException {
		
		if(file.exists()==false) {
			
			FileNotFoundException ex = new FileNotFoundException("File Ma Shi Par");
			throw ex;
		}
		
		System.out.println("Continue Reading");
	}
		
	
}
