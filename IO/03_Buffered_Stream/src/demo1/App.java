package demo1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(new File("D:\\java.txt"));
			br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(br != null) {
				br.close();
			}
		}
	}
	
}
