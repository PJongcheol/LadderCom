package pro01;

public class Code188 {

	public static void main(String[] args) {
		StringBuilder sbd1 = new StringBuilder("Hello");
		StringBuilder sbd2 = new StringBuilder();
		sbd2.append("World");
		
		StringBuilder sbd3 = new StringBuilder(20);
		sbd3.append("Java Programming is created by James Gosling");
		
		System.out.println(sbd1);
		System.out.println(sbd2);
		System.out.println(sbd3);
		
		System.out.println(sbd1.length() + ", " + sbd1.capacity());
		System.out.println(sbd2.length() + ", " + sbd2.capacity());
		System.out.println(sbd3.length() + ", " + sbd3.capacity());
	}

}
