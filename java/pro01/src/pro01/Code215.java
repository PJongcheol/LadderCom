package pro01;

import java.io.*;

public class Code215 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fin = new FileInputStream("data.txt");) {
			do {
				i = fin.read();
				if(i != -1) {
					System.out.println((char) i);
				}
			} while (i != -1 ); {
				
			}
			
		}catch(IOException e) {
			System.out.println("Error reading file");
		}
	}

}
