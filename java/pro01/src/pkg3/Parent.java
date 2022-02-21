package pkg3;

public abstract class Parent {
	private int dataA;
	
	Parent() {
	}
	Parent(int dataA) {
		this.dataA = dataA;
	}
	
	void show() {
		System.out.println("Parent show: " + dataA);
	}
}
