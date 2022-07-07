
package com.example.demo.repository;

import com.example.demo.model.Owner;
import com.example.demo.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {
}

