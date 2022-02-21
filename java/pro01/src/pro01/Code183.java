package pro01;

public class Code183 {

	public static void main(String[] args) {
		String x = new String("Hello World");
		String y = new String("Hello World");
		
		if(x == y) {
			System.out.println("x == y");
		} else {
			System.out.println("x !== y");
		}
		
		if(x.equals(y)) {
			System.out.println("x equals y");
		} else {
			System.out.println("x not equals y");
		}
	}

}
