import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		File sourceFile = new File("D:\\natebancover.docx");
		File targetFile = new File("D:\\Training\\natebanChSt.docx");
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(sourceFile);
			fw = new FileWriter(targetFile);
			int code;
			while((code = fr.read()) != -1) {
				fw.write(code);
			}
			
			System.out.println("Success");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(fr != null) {
				fr.close();
			}
			if(fw != null) {
				fw.close();
			}
		}
		
	}
}
