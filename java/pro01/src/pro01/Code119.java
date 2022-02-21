package pro01;

class Book1{
	private String title;
	private int price;
	
	Book1() {}
	Book1(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	void printBook() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
	}
}

public class Code119 {

	public static void main(String[] args) {
		Book1 bk = new Book1("Java Programming", 25000);
		bk.printBook();
	}

}
