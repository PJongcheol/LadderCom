package pro01;

class Parent9 {
	void printParent() {
		System.out.println("i am parent");
	}
}

class Child9 extends Parent9 {
	Child9() {
		System.out.println("child constructor is called");
	}
	void printChild() {
		System.out.println("i am child");
	}
}

public class Code131 {

	public static void main(String[] args) {
		Child9 c = new Child9();
		c.printParent();
		c.printChild();
	}

}
