package com.example.library.repository;

import com.example.library.model.entity.ServiceTech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceTech,Integer> {
}
