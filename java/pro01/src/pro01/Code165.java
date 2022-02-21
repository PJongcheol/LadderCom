package pro01;

abstract class P3 {
	private int no;
	private String name;
	
	P3() {
	}
	P3(int no, String name) {
		this.no = no;
		this.name = name;
	}
	int getNo() {
		return no;
	}
	String getName() {
		return name;
	}
	abstract void show();
}

class T3 extends P3 {
	private String subject;
	
	T3() {
	}
	T3(int no, String name, String subject) {
		super(no, name);
		this.subject = subject;
	}
	@Override
	void show() {
		System.out.println("Teacher Information");
		System.out.println("--------------");
		System.out.println("number: " + getNo());
		System.out.println("name: " + getName());
		System.out.println("subject: " + this.subject);
	}
	
}

class S3 extends P3 {
	private int year;
	S3() {
	}
	S3(int no, String name, int year) {
		super(no, name);
		this.year = year;
	}
	@Override
	void show() {
		System.out.println("Teacher Information");
		System.out.println("--------------");
		System.out.println("number: " + getNo());
		System.out.println("name: " + getName());
		System.out.println("year: " + this.year);
	}
}
public class Code165 {

	public static void main(String[] args) {
		P3 t1 = new T3(112, "Alice", "Math");
		P3 t2 = new T3(115, "Paul", "English");
		P3 s1 = new S3(5, "David", 2);
		P3 s2 = new S3(7, "Cindy", 1);
		
		t1.show();
		System.out.println();
		t2.show();
		System.out.println();
		s1.show();
		System.out.println();
		s2.show();
	}

}
