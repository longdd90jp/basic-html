package com.example.library.model.entity;

import com.example.library.model.status.StatusTicket;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class TicketBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany(mappedBy = "ticketBooks")
    private List<Book> books;
    @OneToOne
    @JoinColumn(name = "borrower_id")
    private Borrower borrower;
    @Column(name = "create_at")
    private Date createAt;
    @Column(name = "return_date")
    private Date returnDate;
    @Column(name = "status_ticket")
    private StatusTicket statusTicket;
    private String note;
}
