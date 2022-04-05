import java.util.*;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer , String> map = new HashMap<>();
		map.put(1, "One");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(4, "Four");
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());;
		}
 
	}

}
