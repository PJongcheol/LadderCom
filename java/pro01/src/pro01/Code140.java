package pro01;

class Parent3 {
	void print() {
		System.out.println("i am parent print");
	}
}

class Child3 extends Parent3 {
	void print() {
		super.print();
	}
}

public class Code140 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.print();
	}

}
