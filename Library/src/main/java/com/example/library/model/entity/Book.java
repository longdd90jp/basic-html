package com.example.library.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "books")
    private List<Type> types;
    @ManyToMany()
    @JoinTable(name = "book_ticket",joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "ticket_id"))
    private List<TicketBook> ticketBooks;
    private String author;
    private float price;
    private int quantity;
}
