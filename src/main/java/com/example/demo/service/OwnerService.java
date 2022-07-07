package com.example.demo.service;

import com.example.demo.model.Owner;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OwnerService {
    Owner saveOwner(Owner owner);
    Owner loginOwner(String email);
    Owner getOwnerById(long id);
    Page<Owner> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
