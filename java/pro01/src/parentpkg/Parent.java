package parentpkg;

public class Parent {
	private int id;
	public Parent(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void show() {
		System.out.println("id: " + id);
	}
}
