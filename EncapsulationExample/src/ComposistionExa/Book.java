package ComposistionExa;

public class Book {
	private String title;
	private String auther;
	private String isbn;
	
	public Book(String title, String auther, String isbn) {
		this.title = title;
		this.auther = auther;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuther() {
		return auther;
	}
	
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void displayBookDetails() {
		System.out.println("Title:"+this.title+", Auther:"+this.auther+", ISBN:"+this.isbn);
		
	}
	
}
