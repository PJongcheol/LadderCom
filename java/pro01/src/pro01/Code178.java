package pro01;

class Thing3 {
	private String name;
	private int price;
	Thing3(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void show() {
		System.out.println("name: " + name + ", price: " + price);
	}
}

public class Code178 {

	public static void main(String[] args) {
		Thing3 t = new Thing3("book", 20000);
		String s = t.toString();
		
		System.out.println(s);
		System.out.println(t);
	}

}
