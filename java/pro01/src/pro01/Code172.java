package pro01;

interface WithDefault {
	int COUNT = 100;
	void test();
	default void show() {
		System.out.println("I am show");
	}
}

class Test1 implements WithDefault {
	@Override
	public void test() {
		System.out.println("I am test");
	}
}

public class Code172 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
		t.show();
	}

}
