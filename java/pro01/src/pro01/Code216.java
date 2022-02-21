package pro01;

import java.io.*;

public class Code216 {

	public static void main(String[] args) {
		int i;
		String inFile = "input.txt";
		String outFile = "output.txt";
		
		try(FileInputStream fin = new FileInputStream(inFile);
			FileOutputStream fout = new FileOutputStream(outFile);) {
			do {
				i = fin.read();
				if(i != -1) {
					fout.write(i);
				}
			} while(i != -1);
		} catch(IOException ex) {
			System.out.println("File IO error " + ex);
		}
	}

}
