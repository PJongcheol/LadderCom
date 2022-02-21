package pro01;

class Pa3 {
	void show() {
		System.out.println("I am parent show");
	}
	void print() {
		System.out.println("I am parent print");
	}
}
class Ch3 extends Pa3 {
	void show() {
		System.out.println("I am child show");
	}
	void print() {
		System.out.println("I am child print");
	}
}
public class Code143 {

	public static void main(String[] args) {
		Pa3 p = new Pa3();
		p.show();
		p.print();
		Ch3 c = new Ch3();
		c.show();
		c.print();
		
	}

}
