package com.BookStoreManagement.BookStoreManagement.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.BookStoreManagement.BookStoreManagement.entity.MyBookList;
@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}
