import java.util.ArrayList;

class Person {
	
}

class Student extends Person {
	
}

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(123);
		list1.add(456);
		list1.add(789);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		
		ArrayList<Person> list3 = new ArrayList<>();
		list3.add(new Person());
		list3.add(new Person());
		list3.add(new Person());
		
		ArrayList<Student> list4 = new ArrayList<>();
		list4.add(new Student());
		list4.add(new Student());
		list4.add(new Student());
		
		showList(list1);
		showList(list2);
		showList(list3);
		showList(list4);
		//showPeople(list1);
		//showPeople(list2);
		showPeople(list3);
		showPeople(list4);
	}
	
public static void showList(ArrayList<?> list) {

	for(Object value:list) {
		System.out.println(value);
	}
}

public static void showPeople(ArrayList<? extends Person> ppl) {
	for(Person human:ppl) {
		System.out.println(human);
	}
}
	
}
