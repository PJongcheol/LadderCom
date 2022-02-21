package usebookpkg;

import bookpkg.Book;

public class UseBook {

	public static void main(String[] args) {
		Book bk = new Book(101, "algorithms", 25000);
		bk.printBookInfo();
	}

}
