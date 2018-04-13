import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

		public static void main(String[] args) throws IOException {
			
			File sourceFile = new File("D:\\natebancover.docx");
			File targetFile = new File("D:\\Training\\natebanjava.docx");
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream(sourceFile);
				fos = new FileOutputStream(targetFile);
				int code;
				while((code = fis.read())!= -1) {
					fos.write(code);;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
			}
			
			
		}
}
