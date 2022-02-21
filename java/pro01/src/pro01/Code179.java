package pro01;

class Thing1 {
	private String name;
	private int price;
	
	Thing1(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "name: " + name + "price: " + price;
	}
}

public class Code179 {

	public static void main(String[] args) {
		Thing1 t = new Thing1("book", 20000);
		String s = t.toString();
		System.out.println(s);
		System.out.println(t);
	}

}
