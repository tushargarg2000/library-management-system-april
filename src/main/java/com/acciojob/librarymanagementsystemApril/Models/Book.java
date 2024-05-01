package com.acciojob.librarymanagementsystemApril.Models;

import com.acciojob.librarymanagementsystemApril.Enum.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    private String bookName;

    private Integer noOfPages;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Boolean isIssued;

    @JoinColumn
    @ManyToOne
    private Author author;
}
