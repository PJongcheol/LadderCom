package pro01;

class Pe {
	private String name;
	Pe(){
	}
	Pe(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void print() {
		System.out.println("I am " + name);
	}
}
class Te extends Pe {
	private String subject;
	Te() {
	}
	Te(String name,String subject) {
		super(name);
		this.subject = subject;
	}
	void print() {
		System.out.println("I am " + getName() + " and I teach" + subject + ".");
	}
}
class Stu extends Pe {
	private String year;
	Stu() {
	}
	Stu(String name, String year) {
		super(name);
		this.year = year;
	}
	void print() {
		System.out.println("I am " + getName() + " and I am " + year + ".");
	}
}
public class Code151 {

	public static void main(String[] args) {
		Pe p1 = new Te("Alice", "Math");
		Pe p2 = new Stu("David", "Sophomore");
		p1.print();
		p2.print();
	}

}
