import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student (2, "MG MG", 345));
		students.add(new Student (3, "SU SU", 415));
		students.add(new Student (1, "KO KO", 513));
		students.add(new Student (4, "MA MA", 455));
	
		
		Comparator<Student> com = new Comparator<Student>() {

			@Override
			public int compare(Student sd1, Student sd2) {
				if(sd1.getRollNo() < sd2.getRollNo()) {
					return -1;
				}
				return 1;
				}
			};
		
		Collections.sort(students, com);
		
		
		for(Student student:students) {
			System.out.println(student);
		}
		
	}
}
