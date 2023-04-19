package com.sweetline.repository;

import com.sweetline.model.entity.TicketClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketClassRepository extends JpaRepository<TicketClass, Integer> {
}