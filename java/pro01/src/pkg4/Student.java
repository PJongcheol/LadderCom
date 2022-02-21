package pkg4;

public class Student extends Person {
	private int year;
	Student() {
	}
	Student(int no, String name, int year) {
		super(no, name);
		this.year = year;
	}
	@Override
	void show() {
		System.out.println("Teacher Information");
		System.out.println("----------------");
		System.out.println("number: " + getNo());
		System.out.println("name: " + getName());
		System.out.println("subject: " + this.year);
	}
}
