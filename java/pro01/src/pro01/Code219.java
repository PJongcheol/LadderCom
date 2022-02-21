package pro01;

import java.io.FileReader;
import java.io.IOException;

public class Code219 {

	public static void main(String[] args) {
		FileReader fis = null;
		try {
			fis = new FileReader("data3.txt");
			int x;
			while((x = fis.read()) != -1) {
				System.out.print((char)x);
			}
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				System.out.println(e);
			}
		}
	}

}
