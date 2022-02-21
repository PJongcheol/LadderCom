package pro01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Code214 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input1.txt");
			int x;
			while((x = fis.read()) != -1) {
				System.out.print((char)fis.read());
				}
		} catch(FileNotFoundException e) {
				System.out.println("Input1.txt는 없는 파일입니다");
			} catch(IOException e) {
				System.out.println(e);
			} finally {
					try {
						fis.close();
				} catch(IOException e) {
					System.out.println(e);
				} catch(NullPointerException e) {
					System.out.println("fis가 null 값을 갖고 있습니다");
				}
			}
		}
}
