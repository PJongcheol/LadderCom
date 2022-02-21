package pro01;

class Std{
	static int numberOfStudent;
	String name;
	double score;
	
	Std() {
	}
	Std(String n, double d) {
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

public class Code108 {

	public static void main(String[] args) {
		Std s1 = new Std("Alice", 81.0);
		Std s2 = new Std("David", 75.5);
		Std s3 = new Std("Charli", 74.2);
		
		s1.print();
		s2.print();
		s3.print();
	}

}
