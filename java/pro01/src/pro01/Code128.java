package pro01;

class Person2 {
	private String name;
	private String phone;
	
	Person2() {
	}
	Person2(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	void printPerson() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
	}
}

class Student3 extends Person2 {
	private int score;
	Student3(){
	}
	Student3(String name, String phone, int score) {
		super(name, phone);
		this.score = score;
	}
	void printStudent() {
		printPerson();
		System.out.println("score: " + score);
	}
}

public class Code128 {

	public static void main(String[] args) {
		Student3 s = new Student3("Alice", "010-111-1111", 90);
		s.printStudent();
	}

}
