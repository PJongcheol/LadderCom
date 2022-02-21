package pro01;

class Pa {
	void printParent() {
		System.out.println("i am Parent");
	}
}

class Ch extends Pa {
	private int data;
	
	Ch(int data) {
		this.data = data;
	}
	void printChild() {
		System.out.println("data: " + data);
	}
}
public class Code132 {

	public static void main(String[] args) {
		Ch c = new Ch(10);
		c.printParent();
		c.printChild();
	}

}
