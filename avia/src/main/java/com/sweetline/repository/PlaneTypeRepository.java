package com.sweetline.repository;

import com.sweetline.model.entity.PlaneType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneTypeRepository extends JpaRepository<PlaneType, Integer> {
}