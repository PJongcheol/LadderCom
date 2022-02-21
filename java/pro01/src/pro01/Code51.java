package pro01;

public class Code51 {

	public static void main(String[] args) {
		int score = 80;
		char grade;
		
		switch(score) {
		case 90:
			grade = 'A';
			break;
		case 80:
			grade = 'B';
			break;
		case 70:
			grade = 'C';
			break;
		default: 
			grade = 'D';
			break;
		}
		System.out.println("grade: " + grade);
		
		if(score == 90) {
			grade = 'A';
		} else if (score == 80) {
			grade = 'B';
		} else if (score == 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("grade: " + grade);
	}

}
