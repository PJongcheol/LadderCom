package pro01;

class Parent {
	Parent() {
		System.out.println("parent constructor is called");
	}
	void printParent() {
		System.out.println("i am parent");
	}
}

class Child extends Parent {
	Child() {
		System.out.println("child constructor is called");
	}
	void printChild() {
		System.out.println("i am child");
	}
}

public class Code130 {

	public static void main(String[] args) {
		Child c = new Child();
		c.printParent();
		c.printChild();
	}

}
