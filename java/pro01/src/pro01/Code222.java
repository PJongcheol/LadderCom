package pro01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Studen {
	private int no;
	private String name;
	private int score;
	
	Studen() {
	}
	Studen(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}
	int getNo() {
		return no;
	}
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
	public String toString() {
		return no + " : " + name + "( " + score + " )";
	}
 }

public class Code222 {

	public static void main(String[] args) {
		Studen ST[] = new Studen[10];
		File file = new File("student.txt");
		Scanner scin = null;
		int i = 0;
		
		try {
			scin = new Scanner(file);
			while (scin.hasNext()) {
				int no = scin.nextInt();
				String name = scin.next();
				int score = scin.nextInt();
				ST[i++] = new Studen(no, name, score);
			}
		} catch(IOException e) {
			System.out.println("student.txt not exist!!");
		}
		System.out.println("== Student List ==");
		System.out.println("----------------");
		for (Studen s : ST) {
			System.out.println(s);
		}
		scin.close();
 	}

}
