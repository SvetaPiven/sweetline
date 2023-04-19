package com.sweetline.repository;

import com.sweetline.model.entity.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightStatusRepository extends JpaRepository<FlightStatus, Integer> {
}