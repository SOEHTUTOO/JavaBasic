class Test <T> {
	
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
public class App {
	
	public static void main(String[] args) {
		
		Test<Integer> test1 = new Test<Integer>();
		test1.setValue(123);
		int iValue = test1.getValue();
		System.out.println(iValue);
		
		Test<String> test2 = new Test<String>();
		test2.setValue("Hello");
		String sValue = test2.getValue();
		System.out.println(sValue);
		
	}

}
