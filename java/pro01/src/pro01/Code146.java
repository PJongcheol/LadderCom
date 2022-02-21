package pro01;

class Ci {
	static final double PI = 3.141592;
	private double radius;
	
	Ci() {}
	Ci(double radius) {
		this.radius = radius;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
}

public class Code146 {

	public static void main(String[] args) {
		Ci c1 = new Ci(1.5);
		Ci c2 = new Ci(2.2);
		
		double c1Area = Ci.PI * c1.getRadius() * c1.getRadius();
		double c2Area = Ci.PI * c2.getRadius() * c2.getRadius();
		
		System.out.println("c1 area: " + c1Area);
		System.out.println("c2 area: " + c2Area);
	}

}
