package com.acciojob.librarymanagementsystemApril.Repositories;

import com.acciojob.librarymanagementsystemApril.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
