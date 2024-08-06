package ComposistionExa;

public class CompositionTest {

	public static void main(String[] args) {
		//create a library with capacity of 3 books
		Library myLibrary= new Library(3);
		
		//create some books
		Book book1= new Book("The catcher in the Rye","J.D.Sinlger","789-8797909987");
		Book book2= new Book("To kill MockingBird","Harper Lee","645-9823765358");
		Book book3= new Book("1984","George Orwell ","343-7623762712");
		Book book4= new Book("Pride and prejustics","Jane Austen","232-6732618763");
		
		//add books to library
		myLibrary.addBook(book1);
		myLibrary.addBook(book2);
		myLibrary.addBook(book3);
		
		//trying to add when library is full
		myLibrary.addBook(book4);
		
		myLibrary.displayLibraryBooks();
		

	}

}
