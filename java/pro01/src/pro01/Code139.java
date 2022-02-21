package pro01;

class Par1 {
	void print() {
		System.out.println("I am parent print");
	}
}
class Chi1 extends Par1 {
	void print() {
		System.out.println("I am Child print");
	}
}
public class Code139 {

	public static void main(String[] args) {
		Chi1 c = new Chi1();
		c.print();
	}

}
