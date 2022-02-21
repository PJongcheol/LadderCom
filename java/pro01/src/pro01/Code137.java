package pro01;

class  Pare{
	private int data = 10;
	int getData() {
		return data;
	}
}
class Chil extends Pare {
	int data = 20;
	
	void printData() {
		System.out.println("data from Parent: " + super.getData());
		System.out.println("data from Child: " + this.data);
		System.out.println("data from Child: " + data);
	}
}
public class Code137 {

	public static void main(String[] args) {
		Chil c = new Chil();
		c.printData();
	}

}
