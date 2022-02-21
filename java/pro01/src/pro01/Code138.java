package pro01;

class Pa1 {
	void printParent() {
		System.out.println("I am parent print");
	}
}
class Ch1 extends Pa1 {
	void printChild() {
		System.out.println("I am Child print");
	}
}
public class Code138 {

	public static void main(String[] args) {
		Ch1 c = new Ch1();
		c.printParent();
		c.printChild();
	}

}
