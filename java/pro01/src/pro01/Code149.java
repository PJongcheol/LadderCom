package pro01;

class Parent5 {
	void print() {
		System.out.println("parent - print method");
	}
	void test() {
		System.out.println("Parent - test method");
	}
}

class Child5 extends Parent5 {
	void print() {
		System.out.println("child - print method");
	}
	void check() {
		System.out.println("child - check method");
	}
}

public class Code149 {

	public static void main(String[] args) {
		Parent5 p = new Parent5();
		p.print();
		p.test();
		
		Child5 c = new Child5();
		c.print();
		c.check();
		c.test();
		
		Parent5 x = new Child5();
		x.print();
		x.test();
	}

}
