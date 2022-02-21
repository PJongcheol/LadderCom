package pro01;

class Car2{
	String kind;
	String color;
	int year;
}

public class Code95 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.kind = "Sonata";
		myCar.color = "white";
		myCar.year = 2015;
		
		Car2 yourCar = new Car2();
		yourCar.kind = "Pride";
		yourCar.color = "blue";
		yourCar.year = 2017;
		
		System.out.println(myCar);
		System.out.println(yourCar);
	}

}
