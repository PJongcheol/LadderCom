package pro01;

class Student1 {
	private String name;
	private int score;
	
	Student1 (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
	void print() {
		System.out.println(name + "(" + score + ")");
	}
}


public class Code125 {

	public static void main(String[] args) {
		Student1 st[] = new Student1[5];
		st[0] = new Student1("Alice", 88);
		st[1] = new Student1("Tom", 98);
		st[2] = new Student1("Janny", 80);
		st[3] = new Student1("Betty", 79);
		st[4] = new Student1("Daniel", 91);
		
		int total = 0;
		for(int i = 0; i < st.length; i++) {
			total += st[i].getScore();
		}
		double average = (double)total / st.length;
		System.out.println("average: " + average);
	}

}
