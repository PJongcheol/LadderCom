package pro01;

public class Code92 {

	public static void test(int...v) {
		System.out.println("v.length: " + v.length);
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	public static void test(double...w) {
		System.out.println("w.length: " + w.length);
		for(int i = 0; i < w.length; i++) {
			System.out.println(w[i]);
		}
	}
	public static void test(String y, int...x) {
		System.out.println("y: " + y);
		System.out.println("x.length: " + x.length);
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	public static void main(String[] args) {
		test(1, 2, 3, 4, 5);
		test(1.1, 2.2, 3.3);
		test("hello", 10, 20, 30);
	}

}
