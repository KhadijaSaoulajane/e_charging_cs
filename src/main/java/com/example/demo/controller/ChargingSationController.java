
package com.example.demo.controller;

import com.example.demo.model.Station;
import com.example.demo.service.CsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/listCS")
    public List<Station> listCS()
    {
        return CsService.listCS();
    }

}

