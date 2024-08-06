package com.example.MongoSpringBoot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	
	public String saveBook(Book book) {
		bookRepo.save(book);
		return "Added Successfully";	
	}
	
	public List<Book> getBooks(){
		return bookRepo.findAll();	
	}
	
	public String deleteBook(String id) {
		bookRepo.deleteById(id);
		return "deleted successfully.";
	}
	
	public Book updateBook(Book book, String bookId) {
        // TODO Auto-generated method stub
        Optional<Book> optional = bookRepo.findById(bookId);
        if(optional.isPresent())
        {
            optional.get().setBookName(book.getBookName());
            optional.get().setAutherName(book.getAutherName());
           
        }else {
            return null;
        }
        return bookRepo.save(optional.get());
    }
	

}
