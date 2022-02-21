package pro01;

class Parent2 {
	int data = 10;
}

class Child2 extends Parent2 {
	int data = 20;
	
	void printData() {
		System.out.println("data from Parent: " + super.data);
		System.out.println("data from Child: " + this.data);
		System.out.println("data from Child: " + data);
	}
}

public class Code136 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.printData();
	}

}
