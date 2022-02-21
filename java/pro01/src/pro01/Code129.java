package pro01;

class Parent8 {
	int x = 10;
	int y = 20;
	
	void show() {
		System.out.println("i am parent show");
	}
	void print() {
		System.out.println("i am parent print");
	}
}

class Child8 extends Parent8 {
	int y = 30;
	int z = 40;
	
	void show() {
		System.out.println("i am child show");
	}
	void check() {
		System.out.println("i am child cheak");
	}
}

public class Code129 {

	public static void main(String[] args) {
		Child8 c = new Child8();
		System.out.println("c.x: " + c.x);
		System.out.println("c.y: " + c.y);
		System.out.println("c.z: " + c.z);
		
		c.show();
		c.print();
		c.check();
	}

}
