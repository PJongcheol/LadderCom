package pro01;

class Data3 {
	static int x;
	int y;
	
	Data3(int x, int y) {
		Data3.x = x;
		this.y = y;
	}
	
	static void print() {
		System.out.println("x: " + x);
//		System.out.println("y: " + y);
	}
}

public class Code116_1 {

	public static void main(String[] args) {
		Data3 d = new Data3(10, 20);
		d.print();
	}

}
