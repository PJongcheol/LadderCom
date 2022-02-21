package pro01;

class Block {
	Block() {
		System.out.println("I am constructor");
	}
	{
		System.out.println("I am block");
	}
}

public class Code117 {

	public static void main(String[] args) {
		Block b1 = new Block();
		Block b2 = new Block();
	}

}
