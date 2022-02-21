package pro01;

class P2 {
	void print() {
		System.out.println("parnet print");
	}
	void test() {
		System.out.println("parent test");
	}
}
class C2 extends P2 {
	@Override
	void print() {
		System.out.println("child print");
	}
	void check() {
		System.out.println("child check");
	}
}
public class Code150 {

	public static void main(String[] args) {
		P2 p = new C2();
		p.print();
		p.test();
	}

}
