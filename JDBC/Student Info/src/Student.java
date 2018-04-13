import java.util.Scanner;

public class Student {
	
	private Scanner userInput;

	private String studentName;
	private String birthDate;
	private String birthMonth;
	private String birthYear;
	private String fatherName;
	private String motherName;
	private String studentPlace;
	private String studentMobile;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getStudentPlace() {
		return studentPlace;
	}
	public void setStudentPlace(String studentPlace) {
		this.studentPlace = studentPlace;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	@Override
	public String toString() {
		return "We have collected your information to our database.\nCheck can your info here.\nIf something went wrong you can edit your info anytime."
				+ "\n\tYour Name : " + studentName 
				+ "\n\tYour Birthday : " + birthDate 
				+ " - " + birthMonth
				+ " - " + birthYear 
				+ "\n\t Your Father Name : " + fatherName 
				+ "\n\t Your Motehr Name : " + motherName
				+ "\n\t Your Address : " + studentPlace 
				+ "\n\t Your Contact Phone Number : " + studentMobile;
	}	
	
	
	
}
