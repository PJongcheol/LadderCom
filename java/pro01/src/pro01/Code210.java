package pro01;

import java.io.IOException;

public class Code210 {
	public static void main(String[] args) {
		int x;
		try {
			while((x = System.in.read()) != -1) {
				System.out.print((char)x);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
