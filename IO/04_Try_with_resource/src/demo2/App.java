package demo2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		File outputFile = new File("D:\\javaoutput2.txt");


		try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			bw.write("Hello");
			bw.newLine();
			bw.write("How are you?");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
