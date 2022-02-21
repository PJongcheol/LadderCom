package pro01;

class Field {
	String name;
	int age;
	
	void printField() {
		System.out.println("name: " + name + ", age: " + age);
	}
}

public class Code98 {

	public static void main(String[] args) {
		Field f = new Field();
		f.printField();
		f.name = "Alice";
		f.age = 20;
		f.printField();
	}

}
