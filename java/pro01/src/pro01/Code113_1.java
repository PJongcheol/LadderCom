package pro01;

class Friend1 {
	String name;
	int age;
	
	Friend1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void hello() {
		System.out.println("hello");
	}
	void printFriend() {
		this.hello();
		System.out.println("name: " + this.name + ", age: " + this.age);
	}
}

public class Code113_1 {

	public static void main(String[] args) {
		Friend1 f = new Friend1("박종철", 26);
		f.printFriend();
		
	}

}
