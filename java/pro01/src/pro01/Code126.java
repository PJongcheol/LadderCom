package pro01;

class Score2 {
	private int math;
	private int english;
	
	 Score2(){}
	 Score2(int math, int english) {
		this.math = math;
		this.english = english;
	}
	
	int getMath() {
		return math;
	}
	int getEnglish() {
		return english;
	}
	void setMath(int math) {
		this.math = math;
	}
	void setEnglish(int english) {
		this.english = english;
	}
	void incMath(int n) {
		this.math += n;
	}
	void incEnglish(int n) {
		this.english += n;
	}
}

class Student2 {
	private String name;
	private Score2 score;
	
	Student2() {
	}
	Student2(String name, Score2 score) {
		this.name = name;
		this.score = score;
	}
	String getName() {
		return name;
	}
	Score2 getScore() {
		return score;
	}
	void setName(String name) {
		this.name = name;
	}
	void setScore(Score2 score) {
		this.score = score;
	}
	void incScore(int m, int e) {
		score.incMath(m);
		score.incEnglish(e);
	}
	void printSudent() {
		System.out.println(name + ": math(" + score.getMath() +"), english(" + score.getEnglish() + ")");
	}
}
public class Code126 {

	public static void main(String[] args) {
		Student2 s1 = new Student2("Alice", new Score2(90, 80));
		
		Score2 a = new Score2(88, 93);
		Student2 s2 = new Student2("Bob", a);
		
		Student2 s3 = new Student2();
		Score2 b = new Score2(78, 70);
		s3.setName("Paul");
		s3.setScore(b);
		
		s1.incScore(3, 5);
		
		s1.printSudent();
		s2.printSudent();
		s3.printSudent();
	}

}
