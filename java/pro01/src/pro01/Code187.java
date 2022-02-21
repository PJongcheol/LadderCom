package pro01;

public class Code187 {

	public static void main(String[] args) {
		String s = new String("Compuer");
		String new_s = s.substring(0,5) + 't' + s.substring(5);
		System.out.println("new_s: " + new_s);
		
		StringBuffer sb = new StringBuffer("Compuer");
		sb.insert(5, 't');
		System.out.println("sb: " + sb);
	}

}
