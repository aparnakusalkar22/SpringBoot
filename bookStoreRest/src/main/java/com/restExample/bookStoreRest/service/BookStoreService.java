package com.restExample.bookStoreRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restExample.bookStoreRest.entity.BookStoreEntity;
import com.restExample.bookStoreRest.repository.BookStoreRepository;
@Service
public class BookStoreService {
	@Autowired BookStoreRepository repo;
	public List<BookStoreEntity> getBooks() {
		return repo.findAll();
	}

	public BookStoreEntity addBook(BookStoreEntity ae) {
		return repo.save(ae);
	}

	public BookStoreEntity editBook(BookStoreEntity ae, Integer id) {
		return repo.save(ae);
	}

	public BookStoreEntity getBook(Integer id) {
		return  repo.findById(id).get();
	}

	public void deleteBook(Integer id) {
		repo.deleteById(id);
	}

}
