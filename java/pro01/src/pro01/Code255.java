package pro01;

class NumberThread2 extends Thread {
	String name;
	NumberThread2(String name) {
		this.name = name;
	}
	public void run() {
		System.out.println(name + "starting");
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(300);
				System.out.println("in " + name + ": " + i);
			}
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name + "terminating");
	}
}

public class Code255 {

	public static void main(String[] args) {
		System.out.println("main starting");
		Thread th = new Thread(new NumberThread2("Number Thread"));
		th.start();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
				System.out.println("in main: " + i);
			} catch(InterruptedException e) {
				
			}
		}
	}

}
