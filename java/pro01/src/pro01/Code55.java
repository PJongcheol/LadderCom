package pro01;

import java.util.Scanner;

public class Code55 {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scin.nextInt();
		while (n > 0) {
			int m = n % 10;
			System.out.println(m);
			n /= 10;
		}
		scin.close();
	}

}
