package pro01;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

class Person13 {
	private String name;
	private int score;
	
	Person13(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String toString() {
		return "(" + name + "," + score + ")";
	}
}

public class Code250 {

	public static void main(String[] args) {
		TreeMap<Integer, Person13> map = new TreeMap<Integer, Person13>();
		map.put(3, new Person13("David", 80));
		map.put(1, new Person13("Bob", 90));
		map.put(2, new Person13("Alice", 88));
		map.put(5, new Person13("Cindy", 77));
		map.put(4, new Person13("Jenny", 93));
		
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println("-----------------");
		
		for(Map.Entry<Integer, Person13> e : map.entrySet()) {
			Integer  key = e.getKey();
			Person13 value = e.getValue();
			System.out.println(key + " :" + value);
		}
		System.out.println("-----------------");
		Person13 val = (Person13)map.get(3);
		System.out.print("key 3 -> ");
		System.out.println(val);
	}
}
