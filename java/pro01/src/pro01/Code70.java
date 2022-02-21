package pro01;

public class Code70 {

	public static void main(String[] args) {
		int[][] data = {{3, 1, 7, 8},
				 		{9, 2, 2, 5},
				 		{1, 3, 5, 7}};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

}
