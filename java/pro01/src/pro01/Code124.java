package pro01;

class Point2 {
	private int x;
	private int y;
	
	Point2() {
	}
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y = y;
	}
}

public class Code124 {
	static Point2 add(Point2 t1, Point2 t2) {
		Point2 t3 = new Point2();
		t3.setX(t1.getX() + t2.getX());
		t3.setY(t1.getY() + t2.getY());
		return t3;
	}
	
	
	public static void main(String[] args) {
		Point2 p1 = new Point2(10, 20);
		Point2 p2 = new Point2(11, 33);
		Point2 p3 = add(p1, p2);
		System.out.println("p3: (" + p3.getX() + "," + p3.getY() + ")");
	}

}
