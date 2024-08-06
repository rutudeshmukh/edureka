package com.org.tcs.ConsumerService.model;

public class Book {
	int BookId;
	String BookName;
	int BookCost;
	
	public Book() {
		super();
	}

	public Book(int bookId, String bookName, int bookCost) {
		super();
		BookId = bookId;
		BookName = bookName;
		BookCost = bookCost;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public int getBookCost() {
		return BookCost;
	}

	public void setBookCost(int bookCost) {
		BookCost = bookCost;
	}
	
}
