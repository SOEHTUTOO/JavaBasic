import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class App {

	public static void main(String[] args) {

		////////// Number Binding ////////////
		
		IntegerProperty num1 = new SimpleIntegerProperty();
		num1.set(5);
		IntegerProperty num2 = new SimpleIntegerProperty();
		num2.set(2);
		
		NumberBinding binding = num1.add(num2);
		
		System.out.println(binding.getValue());
		
		num1.set(3);
		
		System.out.println(binding.getValue());
		
		num2.set(7);
		
		System.out.println(binding.getValue());
		
		/////////// Add Listener ///////////////
		
		StringProperty text = new SimpleStringProperty();
		text.set("HELLO");
		
		text.addListener(new ChangeListener<String> () {

			@Override
			public void changed(ObservableValue<? extends String> obj, String oldVal, String newVal) {
				
				System.out.println("Object : "+obj);
				System.out.println("Old Value : "+oldVal);
				System.out.println("New Value : "+newVal);
				
			}
		
		});
		
		text.set("HI");
		
		num2.addListener(new ChangeListener<Number> () {

			@Override
			public void changed(ObservableValue<? extends Number> obj, Number oldVal, Number newVal) {
				
				System.out.println("Object : "+obj);
				System.out.println("Old Value : "+oldVal);
				System.out.println("New Value : "+newVal);
				
			}
			
		});
		
		num2.set(15);

	}

}
