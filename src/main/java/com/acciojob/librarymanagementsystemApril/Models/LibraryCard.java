package com.acciojob.librarymanagementsystemApril.Models;

import com.acciojob.librarymanagementsystemApril.Enum.CardStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardId;

    private Integer noOfBooksIssued;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    //this has to be written in child class
    @JoinColumn //by default it adds the PK, incase you add any other column
    @OneToOne //Mapping between entries
    private Student student; //Which entity you have connected

}
