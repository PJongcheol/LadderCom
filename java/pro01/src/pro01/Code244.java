package pro01;

import java.util.Iterator;
import java.util.TreeSet;

class Person11 implements Comparable<Person> {
	private int id;
	private int score;
	Person11() {
	}
	Person11(int id, int score) {
		this.id = id;
		this.score = score;
	}
	public String toString() {
		return "[id =" + id + ", score=" + score + "]";
	}
	public int compareTo(Person11 p) {
		return this.id - p.id;
	}
	@Override
	public int compareTo(Person o) {
		return 0;
	}
}

public class Code244 {

	public static void main(String[] args) {
		TreeSet<Person11> ts = new TreeSet<Person11>();
		ts.add(new Person11(3, 83));
		ts.add(new Person11(5, 90));
		ts.add(new Person11(1, 93));
		ts.add(new Person11(2, 88));
		ts.add(new Person11(4, 70));
		
		Iterator<Person11> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
