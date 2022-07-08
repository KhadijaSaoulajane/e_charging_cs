package com.example.demo.controller;

import com.example.demo.model.Owner;
import com.example.demo.model.Station;
import com.example.demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {
    @Autowired
    private OwnerService ownerService;


    @GetMapping("/saveOwner")
    public String saveOwner(@RequestParam String name,@RequestParam String email,@RequestParam String pass)
    {
         ownerService.saveOwner(new Owner(name,email,pass));
         return "success";
    }

    @GetMapping("/loginOwner")
    public Owner loginOwner(@RequestParam String email)
    {
        return ownerService.loginOwner(email);
    }




}
