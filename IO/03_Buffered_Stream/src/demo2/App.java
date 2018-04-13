package demo2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) {
		
		File outputFile = new File("D:\\javaoutput.txt");
		BufferedWriter bw = null;
		
		try {
			FileWriter fw = new FileWriter(outputFile);
			bw = new BufferedWriter(fw);
			
			bw.write("Hello");
			bw.newLine();
			bw.write("How are you?");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
