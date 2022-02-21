package pro01;

class Da1 {
	void print() {
		System.out.println("class Data1 print method");
	}
}
class Da2 {
	void show() {
		System.out.println("class Data2 show method");
	}
}
public class Code152 {

	public static void main(String[] args) {
		Da1 d1 = new Da1();
		Da2 d2 = new Da2();
		
		if(d1 instanceof Da1) {
			d1.print();
		}
		if(d2 instanceof Da2) {
			d2.show();
		}
	}

}
