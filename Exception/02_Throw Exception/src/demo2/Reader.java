package demo2;

import java.io.File;
import java.io.FileNotFoundException;

public class Reader {

	public void read(File file) throws FileMaShiException {
		
		if(file.exists()==false) {
			
			FileMaShiException ex = new FileMaShiException("File Ma Shi Par");
			throw ex;
		}
		
		System.out.println("Continue Reading");
	}
		
	
}
