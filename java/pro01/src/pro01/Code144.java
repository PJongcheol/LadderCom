package pro01;

class Pa4 {
	void show() {
		System.out.println("I am parent show");
	}
	void show(int data) {
		System.out.println("I am parent show - data: " + data);
	}
	void show(String msg) {
		System.out.println("I am parent: " + msg);
	}
}
class Ch4 extends Pa4 {
	void show(int data) {
		System.out.println("I am child show - data: " + data);
	}
}

public class Code144 {

	public static void main(String[] args) {
		Ch4 c = new Ch4();
		c.show();
		c.show(100);
		c.show("hello");
	}

}
