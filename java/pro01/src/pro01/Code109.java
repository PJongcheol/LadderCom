package pro01;

class Std1{
	static int numberOfStudent;
	String name;
	double score;
	
	Std1() {
	}
	Std1(String n, double d) {
		numberOfStudent++;
		name = n;
		score = d;
	}
	void print() {
		System.out.println("name: " + name);
		System.out.println("score: " + score);
		System.out.println("numberOfStudent: " + numberOfStudent);
	}
}

public class Code109 {

	public static void main(String[] args) {
		Std1 s1 = new Std1("Alice", 81.0);
		s1.print();
		Std1 s2 = new Std1("David", 75.5);
		s2.print();
		Std1 s3 = new Std1("Charli", 74.2);
		s3.print();

	}

}
