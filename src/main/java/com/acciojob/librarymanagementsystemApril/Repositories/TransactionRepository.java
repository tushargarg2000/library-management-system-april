package com.acciojob.librarymanagementsystemApril.Repositories;

import com.acciojob.librarymanagementsystemApril.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
