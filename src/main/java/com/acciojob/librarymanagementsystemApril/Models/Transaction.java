package com.acciojob.librarymanagementsystemApril.Models;

import com.acciojob.librarymanagementsystemApril.Enum.TransactionStatus;
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
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;

    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    @CreationTimestamp //Automatically when you save to Db it will be set
    private Date issueDate;

    private Date returnDate;

    private Integer fineAmt;

    @JoinColumn
    @ManyToOne
    private LibraryCard card;

    @JoinColumn
    @ManyToOne
    private Book book;
}
