package com.restExample.bookStoreRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restExample.bookStoreRest.entity.BookStoreEntity;
import com.restExample.bookStoreRest.service.BookStoreService;


@RestController
public class BookStoreController {
		@Autowired BookStoreService service;
		
		@GetMapping("/bookstore/books")
		public List<BookStoreEntity> getAllBooks(){
		    return service.getBooks();
		}
		@PostMapping("/bookstore/books")
		public BookStoreEntity insertBook(@RequestBody BookStoreEntity ae) {
			return service.addBook(ae);
		}
		
		@PutMapping("/bookstore/books/{id}")
		public BookStoreEntity updateBook(@PathVariable("id")Integer id, @RequestBody BookStoreEntity ae)
		{
			return service.editBook(ae,id);
		}
		
		@RequestMapping(method=RequestMethod.GET,path="/bookstore/books/{id}")
	    public BookStoreEntity getBookDetails(@PathVariable("id")Integer id) {
	        return service.getBook(id);
	    }
	    
	    @RequestMapping(method=RequestMethod.DELETE,path="/bookstore/books/{id}")
	    public String removeBook(@PathVariable("id")Integer id) {
	        service.deleteBook(id);
	        return "Book Details are removed Successfully.....";
	    }
}
