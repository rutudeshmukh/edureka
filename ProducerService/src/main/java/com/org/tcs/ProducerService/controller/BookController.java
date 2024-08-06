package com.org.tcs.ProducerService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.tcs.ProducerService.model.Book;

@RestController
@RequestMapping(path="/Book")
public class BookController {
	
	@Autowired
	Environment env;
	
	@GetMapping("/get")
	public String getBook() {
		return env.getProperty("local.server.port");
		
	}
	
	@GetMapping("/getId/{id}")
	public Book getBookById(@PathVariable int id){
		return new Book(1, "ABD ", 1500);
	}
	
	@GetMapping("/getall")
	public List<Book> getAllBooks(){
		List<Book> ar =new ArrayList<>();
		ar.add(new Book(1, "ABD ", 1500));
		ar.add(new Book(2, "RUY ", 3000));
		ar.add(new Book(3, "UIO ", 5500));
		return ar;
	}
}
