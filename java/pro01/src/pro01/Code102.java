package pro01;

class Student5 {
	int no;
	String name;
	double score;
	
	Student5() {
	}
	Student5(int n) {
		no = n;
	}
	Student5(int n, String nm) {
		no = n;
		name = nm;
	}
	Student5(int n, String nm, double s) {
		no = n;
		name = nm;
		score = s;
	}
	void printStudent() {
		System.out.println("no: " + no + ", name" + name + ", score:" + score);
	}
}

public class Code102 {

	public static void main(String[] args) {
		Student5 s1 = new Student5();
		Student5 s2 = new Student5(10);
		Student5 s3 = new Student5(15, "David");
		Student5 s4 = new Student5(20, "Paul", 92.5);
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		s4.printStudent();
	}

}
