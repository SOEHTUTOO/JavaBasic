import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NumberComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer n1, Integer n2) {
		if(n1>n2) {
			return -1;
		}
		return 1;
	}
	
}

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String text1, String text2) {
		if(text1.length() > text2.length()) {
			return 1;
		}
		return -1;
	}
	
	
}

class StringAZComparator implements Comparator<String> {

	@Override
	public int compare(String text1, String text2) {
		return -text1.compareTo(text2); // we put -(minus) because of want to sort Z to A and to get -value and +value
	}
	
	
}

public class App {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		
		//Collections.sort(numbers); Natural Order
		
		Comparator<Integer> com1 = new NumberComparator();
		
		Collections.sort(numbers, com1);
		
		for(Integer num:numbers) {
			System.out.println(num);
		}
		
		List<String> animals = new ArrayList<>();
		animals.add("Elephant");
		animals.add("Ant");
		animals.add("Bird");
		animals.add("Puppy");
		animals.add("Gorilla");
		
		Comparator<String> com2 = new StringComparator();
		
		Collections.sort(animals, com2);
		
		for(String animal:animals) {
			System.out.println(animal);
		}
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Stawberry");
		fruits.add("WaterMallo");
		
		Comparator<String> com3 = new StringAZComparator();
		
		Collections.sort(fruits, com3);
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		String compareA = "Orange";
		String compareB = "Coconut";
		
		int compareNumberValue = compareA.compareTo(compareB);
		
		System.out.println("Compared Number Value : "+compareNumberValue);
		
		
	}

}
