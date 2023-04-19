package com.sweetline.repository;

import com.sweetline.model.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
//    @Query("SELECT e from Passenger e left join fetch e.tickets")
//    List<Passenger> findBlaBlah();
}