
package com.example.demo.service;

import com.example.demo.model.Station;

import java.util.List;

public interface CsService {
    Station saveStation(Station cs);
    List<Station> listCS();

}
