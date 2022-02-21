package pkg3;

public class Child extends Parent {
	private int dataB;
	
	Child() {
	}
	Child(int dataA, int dataB) {
		super(dataA);
		this.dataB = dataB;
	}
	@Override
	void show() {
		super.show();
		System.out.println("Child show: " + dataB);
	}
}
