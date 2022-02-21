package pro01;

class PersonInfo1{
	String name;
	int age;
	double height;
	
	PersonInfo1(){
	}
	PersonInfo1(String n, int a, double h) {
		name = n;
		age = a;
		height = h;
	}
	void printAll() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("height: " + height);
	}
}

public class Code105 {

	public static void main(String[] args) {
		PersonInfo1 p1 = new PersonInfo1();
		PersonInfo1 p2 = new PersonInfo1("Alice", 10, 115.5);
		p1.printAll();
		p2.printAll();
	}

}
