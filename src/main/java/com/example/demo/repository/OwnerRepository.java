package com.example.demo.repository;

import com.example.demo.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findOwnerByEmail(String email);
}
