package com.BookStoreManagement.BookStoreManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStoreManagement.BookStoreManagement.entity.Book;



@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
