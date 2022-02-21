package pro01;

class St {
	int number;
	String name;
	double score;
	
	St() {
	}
	St(int number) {
		this.number = number;
	}
	St(int number, String name) {
		this(number);
		this.name = name;
	}
	St(int number, String name, double score) {
		this(number, name);
		this.score = score;
	}
}

public class Code113 {

	public static void main(String[] args) {
		St s1 = new St(10, "Alice", 88.5);
	}

}
