package pro01;

class Data6 {
	int m;
	Data6(int x) {
		m = x;
	}
	void printData() {
		System.out.println("m: " + m);
	}
}

public class Code103 {

	public static void main(String[] args) {
		Data6 d = new Data6(100);
		d.printData();
	}

}
