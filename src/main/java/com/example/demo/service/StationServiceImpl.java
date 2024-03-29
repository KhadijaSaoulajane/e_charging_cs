package com.example.demo.service;
import com.example.demo.model.Station;
import com.example.demo.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StationServiceImpl implements CsService{

    @Autowired
    private StationRepository stationRepository;



 @Override
    public Station saveStation(Station cs) {
        return stationRepository.save(cs);
    }

    @Override
    public List<Station> listCS() {
        return stationRepository.findAll();
    }


}

