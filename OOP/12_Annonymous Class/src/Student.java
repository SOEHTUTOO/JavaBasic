
public class Student extends Person implements Info{

	@Override
	public void showInfo() {
		System.out.println("I am Student.");
	}
	
	@Override
	public void show() {
		System.out.println("Student");
	}

}
