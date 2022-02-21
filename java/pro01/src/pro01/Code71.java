package pro01;

public class Code71 {

	public static void main(String[] args) {
		int data[][] = new int[3][];
		data[0] = new int[4];
		data[1] = new int[5];
		data[2] = new int[3];
		
		data[0][0] = 10; 
		data[0][1] = 20; 
		data[0][2] = 30;
		data[0][3] = 40;
		data[1][0] = 50; 
		data[1][1] = 60; 
		data[1][2] = 70; 
		data[1][3] = 80; 
		data[1][4] = 90; 
		data[2][0] = 100; 
		data[2][1] = 110; 
		data[2][2] = 120; 
		
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
