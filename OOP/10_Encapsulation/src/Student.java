
public class Student {

	private int rollNo;
	private String name;
	private int mark;
	
	public Student(int rollNo, String name, int mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
}
