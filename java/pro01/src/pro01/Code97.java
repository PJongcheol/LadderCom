package pro01;

class Student4 {
	int no;
	String name;
	double score;
	
	void printStudent() {
		System.out.println("no:    " + no);
		System.out.println("name: " + name);
		System.out.println("score: " + score);
	}
	void updateScore(double change) {
		score += change;
	}
}

public class Code97 {

	public static void main(String[] args) {
		Student4 s1 = new Student4();
		s1.no = 10;
		s1.name = "Alice";
		s1.score = 92.5;
		Student4 s2 = new Student4();
		s2.no = 20;
		s2.name = "David";
		s2.score = 88.2;
		s1.printStudent();
		s2.printStudent();
		s1.updateScore(+2.3);
		s2.updateScore(-1.5);
		System.out.println("--------------");
		s1.printStudent();
		s2.printStudent();
	}

}
