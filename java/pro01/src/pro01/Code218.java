package pro01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Code218 {

	public static void main(String[] args) {
		File file = new File("data2.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
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
