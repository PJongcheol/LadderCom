package pro01;

class Point3 {
	int x;
	int y;
	
	Point3() {
		x = 10;
		y = 20;
	}
	void print() {
		System.out.println("(" + x + "," + y + ")");
	}
}

public class Code100 {

	public static void main(String[] args) {
		Point3 p1 = new Point3();
		Point3 p2 = new Point3();
		
		p1.print();
		p2.print();
	}

}
