package pro01;

class Pa2 {
	void print() {
		System.out.println("I am parent print");
	}
	void test(int x) {
		System.out.println("Parent - test method");
	}
}
class Ch2 extends Pa2{
	void print() {
		super.print();
	}
	void test(int x) {
		super.test(x);
	}
}
public class Code142 {

	public static void main(String[] args) {
		Pa2 p = new Pa2();
		p.print();
		p.test(10);
		Ch2 c = new Ch2();
		c.print();
		c.test(20);
	}

}
