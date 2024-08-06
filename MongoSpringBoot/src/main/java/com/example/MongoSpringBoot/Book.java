package com.example.MongoSpringBoot;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Book {
	
	@Id
	private String id;
	private String bookName;
	private String autherName;
	
	public Book() {
		super();
	}

	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public Book(String id, String bookName, String autherName) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.autherName = autherName;
	}
	
	
	
}
