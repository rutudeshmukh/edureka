package com.org.tcs.ConsumerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.tcs.ConsumerService.model.Book;
import com.org.tcs.ConsumerService.service.BookRestConsumer;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private BookRestConsumer consumer;
	
	@GetMapping("/get")
	public String getStudentInfo() {
		return consumer.getBook();
	}
	@GetMapping("/getall")
	public List<Book> getBookInfo() {
		return consumer.getAllBooks();
	}
	@GetMapping("/getId/{id}")
	public Book getOneBookForStd(@PathVariable int id) {
		return consumer.getBookById(id);
	}
	
	
}
