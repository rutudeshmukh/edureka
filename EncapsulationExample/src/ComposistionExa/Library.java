package ComposistionExa;

public class Library {
	private Book[] books;
	private int bookCount;
	
	public Library(int capacity) {
		books = new Book[capacity];
		bookCount = 0;
		
	}
	//method to add a book in library
	public boolean addBook(Book book) {
		if(bookCount<books.length) {
			books[bookCount++] = book;
			return true;
		}else {
			System.out.println("Library is full. Cannot add more books");
			return false;
		}
		
	}
	//method to display books from library
	public void displayLibraryBooks() {
		System.out.println("Library books:");
		for(int i=0;i<bookCount;i++) {
			System.out.println("Book "+(i+1)+":");
			books[i].displayBookDetails();
		}
	}
	
	
	
}
