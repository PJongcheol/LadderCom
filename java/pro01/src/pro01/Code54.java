package pro01;

import java.util.Scanner;

public class Code54 {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scin.nextInt();
		int a = 1;
		while (a <= n) {
			if(n % a == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
		scin.close();
	}

}
