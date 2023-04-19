package com.sweetline.service;

import com.sweetline.model.entity.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerService {
    List<Passenger> findAll();

    Optional<Passenger> findById(Long id);
}
