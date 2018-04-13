import java.io.Serializable;

public class Student implements Serializable{

	private String name;
	private String age;
	private String birthDate;
	private String id;
	private String father;
	private String mother;
	private String phone;
	private String place;
	


public String getName() {
		return name;
	}

public void setName(String name) {
		this.name = name;
	}

public String getAge() {
		return age;
	}

public void setAge(String age) {
		this.age = age;
	}

public String getBirthDate() {
	return birthDate;
}

public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}

public String getId() {
		return id;
	}

public void setId(String id) {
		this.id = id;
	}

public String getFather() {
		return father;
	}

public void setFather(String father) {
		this.father = father;
	}

public String getMother() {
		return mother;
	}

public void setMother(String mother) {
		this.mother = mother;
	}

public String getPhone() {
		return phone;
	}

public void setPhone(String phone) {
		this.phone = phone;
	}

public String getPlace() {
		return place;
	}

public void setPlace(String place) {
		this.place = place;
	}

@Override
public String toString() {
	return "Colleted for your info --- \n\tNAME : " + name + "\n\tAGE : " + age + "\n\tBIRTH DATE : " + birthDate + "\n\tID : " + id + "\n\tFATHER : " + father
			+ "\n\tMOTHER : " + mother + "\n\tPHONE : " + phone + "\n\tPLACE : " + place + "]";
}





}

