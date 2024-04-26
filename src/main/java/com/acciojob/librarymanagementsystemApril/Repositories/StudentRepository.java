package com.acciojob.librarymanagementsystemApril.Repositories;

import com.acciojob.librarymanagementsystemApril.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
