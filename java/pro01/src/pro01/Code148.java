package pro01;

class Gr {
	int x = 10;
	void show1() {
		System.out.println("I am grandparent show1");
	}
}
class P1 extends Gr {
	int y = 20;
	void show2() {
		System.out.println("I am parent show2");
	}
}
class C1 extends P1 {
	int z = 30;
	void show3() {
		System.out.println("I am child show3");
	}
}
public class Code148 {

	public static void main(String[] args) {
		C1 t = new C1();
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("t.z: " + t.z);
		
		t.show1();
		t.show2();
		t.show3();
	}

}
