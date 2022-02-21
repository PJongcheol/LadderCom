package pro01;

import java.util.Comparator;
import java.util.TreeSet;

class Person12 {
	private int id;
	private int score;
	Person12() {
	}
	Person12(int id, int score) {
		this.id = id;
		this.score = score;
	}
	int getId() {
		return id;
	}
	public String toString() {
		return "[id =" + id + ", score=" + score + "]";
	}
}

class PersonComparator implements Comparator<Person12> {
	public int compare(Person12 o1, Person12 o2) {
		return o1.getId() - o2.getId();
	}
}

public class Code245 {

	public static void main(String[] args) {
		TreeSet<Person12> ts = new TreeSet<Person12>(new PersonComparator());
		ts.add(new Person12(4, 83));
		ts.add(new Person12(5, 90));
		ts.add(new Person12(2, 93));
		ts.add(new Person12(1, 88));
		ts.add(new Person12(3, 70));
		for(Person12 p:ts);
	}

}
