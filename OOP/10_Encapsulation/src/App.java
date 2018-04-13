
public class App {
	public static void main(String[] args) {
		
		Student sd1 = new Student (1, "MG MG", 500);
		Student sd2 = new Student (2, "SU SU", 550);
		
		showStudentInfo(sd1);
		showStudentInfo(sd2);
		
	}
	
	public static void showStudentInfo(Student sd) {
		System.out.println("Student Roll Number : "+sd.getRollNo());
		System.out.println("Student Name : "+sd.getName());
		System.out.println("Student ID : "+sd.getMark());
	}
}



