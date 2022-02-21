package pro01;

class Block1{
	Block1() {
		System.out.println("I am constructor");
	}
	static {
		System.out.println("I am static block");
	}
}

public class Code118 {

	public static void main(String[] args) {
		Block1 b1 = new Block1();
		Block1 b2 = new Block1();
	}

}
