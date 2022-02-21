package pro01;
class Car1 {
		String kind;
		String color;
		int year;
		
	}

public class Code96 {

	public static void main(String[] args) {
		Car1 myCar = new Car1();
		myCar.kind = "Sonata";
		myCar.color = "White";
		myCar.year = 2015;
		
		Car1 myCar2;
		myCar2 = myCar;
		
		System.out.println(myCar);
		System.out.println(myCar2);
	}

}
