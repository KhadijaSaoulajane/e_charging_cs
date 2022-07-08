package com.example.demo.service;

import com.example.demo.model.Owner;

public interface OwnerService {
    Owner saveOwner(Owner owner);
    Owner loginOwner(String email);
}
