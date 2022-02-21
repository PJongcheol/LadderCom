package pro01;

public class Code203 {

	public static void main(String[] args) {
		int A[] = new int[5];
		try {
			A[7] = 100;
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
