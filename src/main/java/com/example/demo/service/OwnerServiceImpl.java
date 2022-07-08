

package com.example.demo.service;


import com.example.demo.model.Owner;
import com.example.demo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;


	@Override
	public Owner saveOwner(Owner owner) {
		return ownerRepository.save(owner);
	}


	@Override
	public Owner loginOwner(String email) {
		return ownerRepository.findOwnerByEmail(email);
	}




}
