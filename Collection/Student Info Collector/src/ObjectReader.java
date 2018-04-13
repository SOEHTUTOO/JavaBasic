import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public void startObjectRead() {
		
		File studentFile = new File("D:\\WorkSpace\\Collection\\Student Info Collector\\src\\files\\Student.bin");
		
		try (ObjectInputStream studentInfoReader = new ObjectInputStream(new FileInputStream(studentFile))){
			
			Student students = (Student) studentInfoReader.readObject();
			
			System.out.println(students);
			
////			for (Student studentInfo : students) {
////				System.out.println(studentInfo);
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
