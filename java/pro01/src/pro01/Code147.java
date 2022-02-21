package pro01;

class Parent4{
	int a = 10;
	void show() {
		System.out.println("i am parent show");
	}
}

class Child4_1 extends Parent4 {
	int b = 20;
	void show1() {
		System.out.println("i am child4_1 show");
	}
}

class Child4_2 extends Parent4 {
	int c = 30;
	void show2() {
		System.out.println("i am child4_2 show");
	}
}

public class Code147 {

	public static void main(String[] args) {
		Child4_1 c1 = new Child4_1();
		Child4_2 c2 = new Child4_2();
		System.out.println("c1.a: " + c1.a);
		System.out.println("c1.b: " + c1.b);
		System.out.println("c2.a: " + c2.a);
		System.out.println("c2.c: " + c2.c);
		c1.show();
		c1.show1();
		c2.show();
		c2.show2();
	}

}
