package interfacetest;

public class ChildrenBook implements Book {
	private String title;
	private String author;
	
	ChildrenBook() {
	}
	ChildrenBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public void printInfo() {
		System.out.println("** Info for books");
	}
	@Override
	public void showTitle() {
		System.out.println("title: " + title);
		System.out.println("author: " + author);
	}
}
