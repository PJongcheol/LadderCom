package pro01;

import java.io.FileInputStream;
import java.io.IOException;

public class Code213 {
		public static void main(String[] args) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream("input1.txt");
				int x;
				while((x = fis.read()) != -1) {
					System.out.print((char)fis.read());
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
