package com.restExample.bookStoreRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restExample.bookStoreRest.entity.BookStoreEntity;

public interface BookStoreRepository extends JpaRepository<BookStoreEntity, Integer>{

}
