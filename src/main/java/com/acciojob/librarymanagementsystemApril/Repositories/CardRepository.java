package com.acciojob.librarymanagementsystemApril.Repositories;

import com.acciojob.librarymanagementsystemApril.Models.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {
}
