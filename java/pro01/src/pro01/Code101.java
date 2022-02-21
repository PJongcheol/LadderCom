package pro01;

class Friend {
	String name;
	int age;
	
	Friend() {}
	Friend(String n, int a) {
		name = n;
		age = a;
	}
	void printFriend() {
		System.out.println("name: " + name + ", age: " + age);
	}
}

public class Code101 {

	public static void main(String[] args) {
		Friend f = new Friend("Alice", 20);
		f.printFriend();
	}

}
