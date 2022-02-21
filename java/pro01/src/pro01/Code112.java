package pro01;

class Book3{
	String title;
	int price;
	
	Book3() {}
	Book3(String title) {
		this.title = title;
	}
	Book3(String title, int price) {
		this.title = title;
		this.price = price;
	}
}

public class Code112 {

	public static void main(String[] args) {
		Book3 b = new Book3("Java" , 25000);
	}

}
