package com.example.library.service;

import com.example.library.model.DTO.BorrowerDTO;
import com.example.library.model.entity.Borrower;
import com.example.library.repository.BorrowerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerService {
    @Autowired
    BorrowerRepository borrowerRepository;

    public Borrower checkExistBorrower(BorrowerDTO dto){
        ModelMapper mapper = new ModelMapper();
        if(borrowerRepository.findByCccd(dto.getCccd())==null){
            Borrower borrower= mapper.map(dto,Borrower.class);
            borrowerRepository.save(borrower);
            return borrower;
        }
        else {
            Borrower borrower = borrowerRepository.findByCccd(dto.getCccd());
            return borrower;
        }
    }
}
