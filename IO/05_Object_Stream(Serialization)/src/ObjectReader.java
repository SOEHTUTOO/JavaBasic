import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) {
		
		File file = new File("D:\\object.bin");
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
			
			Person [] people = (Person [] ) ois.readObject();
			
			System.out.println("Reading Result is,");
			
			for (Person p : people) {
				System.out.println(p);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
