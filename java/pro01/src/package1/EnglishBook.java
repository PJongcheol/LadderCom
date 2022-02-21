package package1;

public class EnglishBook extends Book {
	private int publishedYear;
	
	EnglishBook() {
	}
	EnglishBook(int code, String title, int publishedYear) {
		super(code, title);
		this.publishedYear = publishedYear;
	}
	@Override
	void printInfo() {
		System.out.println("English Book Info");
		System.out.println("-----------");
		System.out.println("code: " + getCode());
		System.out.println("title: " + getTitle());
		System.out.println("publishedYear: " + this.publishedYear);
	}
}
