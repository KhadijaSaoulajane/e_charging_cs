
package com.example.demo.controller;

import com.example.demo.model.Owner;
import com.example.demo.model.Station;
import com.example.demo.service.CsService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChargingSationController {
    @Autowired
    private CsService CsService;


    @GetMapping("/saveStation")
    public Station saveStation(@RequestParam String city,@RequestParam String address,@RequestParam String price,@RequestParam String status,@RequestParam String id)
    {
        Station cs = new Station(city,address, Boolean.parseBoolean(status),Long.parseLong(price),Long.parseLong(id));
        return CsService.saveStation(cs);
    }
}

