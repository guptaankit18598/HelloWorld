import java.util.*;

public class CustomSortingUsingComparator {
	
	public static void main(String[] args) {
		
		
		Comparator<Data<Integer , String>> Compare_key = new Comparator<Data<Integer ,String>>(){

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if(obj1.getKey() < obj2.getKey()) {
					return -1;
				}else if(obj1.getKey() > obj2.getKey()) {
				     return 1;
			}else
				return 0;
		}
			
		};
		
		Set<Data<Integer , String>> set = new TreeSet<>(Compare_key);
		set.add(new Data<Integer , String>(2 , "Two"));
		set.add(new Data<Integer , String>(3 , "Three"));
		set.add(new Data<Integer , String>(4, "Four"));
		set.add(new Data<Integer , String>(1 , "One"));
		
		print(set);
		
//		Set<Data> set = new LinkedHashSet<>();
//		set.add(new Data("afa" , "sfa"));
//		set.add(new Data(3654 , 46));
//		print(set);
		
		
	}
	public static <K,V> void print(Set<Data<Integer, String>> set) {
		for(Data sets:set) {
			System.out.println(sets);
		}
	}

}

class Data<K , V>{
	private K key;
	private V value;
	public Data(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
}
