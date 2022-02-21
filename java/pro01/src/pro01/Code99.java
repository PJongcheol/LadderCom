package pro01;

class Dog2 {
	String name = "싸리";
	String color = "흰색";
	
	Dog2() {
		System.out.println("Default constructor is called");
	}
	void printDog() {
		System.out.println("name: " + name);
		System.out.println("color: " + color);
	}
}

public class Code99 {

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.printDog();
	}

}
