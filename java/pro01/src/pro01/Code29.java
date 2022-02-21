package pro01;

public class Code29 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 5, d;
		d = a++ + --b + ++c;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}

}
