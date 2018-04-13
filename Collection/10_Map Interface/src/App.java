import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		Map<Integer,String> map1 = new HashMap<>();
		Map<Integer,String> map2 = new LinkedHashMap<>();
		Map<Integer,String> map3 = new TreeMap<>();
		
		
		map1.put(123, "Apple");
		map1.put(456, "Orange");
		map1.put(789, "Banana");
		map1.put(123, "Pineapple");
		
		map2.put(123, "Apple");
		map2.put(456, "Orange");
		map2.put(789, "Banana");
		map2.put(123, "Pineapple");
		
		map3.put(123, "Apple");
		map3.put(456, "Orange");
		map3.put(789, "Banana");
		map3.put(123, "Pineapple");
		
		Set<Integer> keys1 = map1.keySet();
		
		for(Integer key:keys1) {
			System.out.println(key+":"+map1.get(key));
		}
		
		Set<Integer> keys2 = map2.keySet();
		
		for(Integer key:keys2) {
			System.out.println(key+":"+map2.get(key));
		}
		
		Set<Integer> keys3 = map3.keySet();
		
		for(Integer key:keys3) {
			System.out.println(key+":"+map3.get(key));
		}
	}
}
