package pro01;

class NumberTread implements Runnable {
	@Override
	public void run() {
		for(int i = 1; i <= 26; i++) {
			System.out.print(i);
		}
	}
}

public class Code254 {
	public static void main(String[] args) {
		Thread th = new Thread(new NumberThread());
		th.start();
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
}
