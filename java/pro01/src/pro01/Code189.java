package pro01;

public class Code189 {

	public static void main(String[] args) {
		StringBuilder sbd1 = new StringBuilder("Hello World");
		StringBuilder sbd2 = new StringBuilder("Hello World");
		
		System.out.println(sbd1);
		if(sbd1.equals(sbd2)) {
			System.out.println("sbd1 equals sbd2");
		} else {
			System.out.println("sbd1 does not equals sbd2");
		}
	}

}
