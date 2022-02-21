package pro01;

class Ca {
	private String color;
	Ca() {
	}
	Ca(String color) {
		this.color = color;
	}
	void drive() {
		System.out.println("driving..");
	}
}
class Sedan extends Ca {
	private int seats;
	Sedan(){
	}
	Sedan(String color, int seats) {
		super(color);
		this.seats = seats;
	}
	void showSeats() {
		System.out.println("This car is " + seats + " seats");
	}
}
class Truck extends Ca {
	private int wheel;
	Truck() {
	}
	Truck(String name, int wheel) {
		super(name);
		this.wheel = wheel;
	}
	void showWheel() {
		System.out.println("This truck is " + wheel + " drive truck");
	}
}
public class Code153 {
	public static void main(String[] args) {
		Ca myCar = new Sedan("white", 4);
		Ca yourCar = new Truck("blue", 4);
		
		if(myCar instanceof Sedan) {
			((Sedan)myCar).showSeats();
		}
		if(yourCar instanceof Truck) {
			((Truck)yourCar).showWheel();
		}
	}
}
