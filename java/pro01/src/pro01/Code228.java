package pro01;

import java.io.*;

public class Code228 {

	public static void main(String[] args) {
		int i = 100;
		double d = 23.79;
		boolean b = true;
		try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data.txt"))) {
			System.out.println("Writing " + i);
			dataOut.writeInt(i);
			System.out.println("Writing " + d);
			dataOut.writeDouble(d);
			System.out.println("Writing " + i);
			dataOut.writeBoolean(b);
		} catch(IOException e) {
			System.out.println("Write error.");
		}
		System.out.println("Writing into file data.txt finished");
		System.out.println();
		System.out.println("Now reading from file data.txt");
		
		try(DataInputStream dataIn = new DataInputStream(new FileInputStream("data.txt"))) {
			i = dataIn.readInt();
			System.out.println("Reading " + i);
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
			b = dataIn.readBoolean();
			System.out.println("Reading " + d);
		} catch(IOException e) {
			System.out.println("Read error");
		}
	}

}
