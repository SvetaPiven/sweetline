package com.sweetline.repository;

import com.sweetline.model.entity.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketStatusRepository extends JpaRepository<TicketStatus, Integer> {
}