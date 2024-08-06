package com.org.tcs.ConsumerService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.tcs.ConsumerService.model.Book;

@FeignClient(name="ProducerService")
public interface BookRestConsumer {
	
	@GetMapping("/Book/get")
	public String getBook();
	@GetMapping("/Book/getId/{id}")
	public Book getBookById(@PathVariable int id);
	
	@GetMapping("/Book/getall")
	public List<Book> getAllBooks();

}
