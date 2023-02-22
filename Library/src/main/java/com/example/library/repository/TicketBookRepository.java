package com.example.library.repository;

import com.example.library.model.entity.TicketBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookRepository extends JpaRepository<TicketBook,Integer> {
}
